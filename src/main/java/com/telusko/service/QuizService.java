package com.telusko.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.telusko.dao.QuestionRepository;
import com.telusko.dao.QuizRepository;
import com.telusko.entities.Question;
import com.telusko.entities.QuestionWrapper;
import com.telusko.entities.Quiz;
import com.telusko.entities.Response;
import com.telusko.exception.ResourceNotFoundException;

@Service
public class QuizService {

    @Autowired
    QuizRepository quizRepository;

    @Autowired
    QuestionRepository questionRepository;

    // Create a new quiz using the specified category, number of questions, and title
    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        try {
            // Fetch random questions by category
            List<Question> questions = questionRepository.findRandomQuestionsByCategory(category, numQ);
            
            // Check if enough questions are retrieved
            if (questions.isEmpty()) {
                return new ResponseEntity<>("Not enough questions available for the given category", HttpStatus.BAD_REQUEST);
            }

            // Create a new Quiz object
            Quiz quiz = new Quiz();
            quiz.setTitle(title);
            quiz.setQuestions(questions);

            // Save the quiz
            quizRepository.save(quiz);

            return new ResponseEntity<>("Quiz created successfully with title: " + title, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Error occurred while creating the quiz", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Fetch all quizzes
    public ResponseEntity<List<Quiz>> getAllQuizzes() {
        try {
            return new ResponseEntity<>(quizRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    // Method to get the questions by quiz ID
    public List<QuestionWrapper> getQuizQuestions(Integer id) {
        // Fetch the quiz from the database
        Optional<Quiz> quiz = quizRepository.findById(id);

        // Check if the quiz is present
        if (quiz.isPresent()) {
            // Get the questions from the quiz object
            List<Question> questionsFromDB = quiz.get().getQuestions();
            List<QuestionWrapper> questionsForUser = new ArrayList<>();

            // Loop through each question and convert it to QuestionWrapper
            for (Question q : questionsFromDB) {
                QuestionWrapper qw = new QuestionWrapper(
                        q.getId(),
                        q.getQuestionTitle(),
                        q.getOption1(),
                        q.getOption2(),
                        q.getOption3(),
                        q.getOption4()
                    );
                questionsForUser.add(qw);  // Add each mapped question to the list
            }

            return questionsForUser;
        } else {
            // Handle case when the quiz is not found (you can throw an exception or return an empty list)
            throw new ResourceNotFoundException("Quiz not found with id: " + id);
        }
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        Quiz quiz = quizRepository.findById(id).get();
        List<Question> questions = quiz.getQuestions();
        int right = 0;
        int i = 0;
        for (Response response : responses) {
            if (response.getResponse().equals(questions.get(i).getRightAnswer())) {
                right++;
            }
            i++;
        }
        return new ResponseEntity<>(right, HttpStatus.OK);
    }

}




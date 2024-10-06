package com.telusko.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.telusko.dao.QuestionRepository;
import com.telusko.entities.Question;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;
    
    public ResponseEntity<List<Question>> getAllQuestions() {
        try {
            return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }
    
    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
        try {
            return new ResponseEntity<>(questionRepository.findByCategory(category), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }
    
    public ResponseEntity<String> addQuestion(Question question) {
        Question out = questionRepository.save(question);
        if (out != null)
            return new ResponseEntity<>("Question added successfully with id: " + out.getId(), HttpStatus.CREATED);
        else
            return new ResponseEntity<>("Something went wrong", HttpStatus.NO_CONTENT);
    }

    // Update an existing question by ID
    public ResponseEntity<String> updateQuestion(Integer id, Question updatedQuestion) {
        try {
            Question existingQuestion = questionRepository.findById(id).orElse(null);
            if (existingQuestion != null) {
                existingQuestion.setQuestionTitle(updatedQuestion.getQuestionTitle());
                existingQuestion.setOption1(updatedQuestion.getOption1());
                existingQuestion.setOption2(updatedQuestion.getOption2());
                existingQuestion.setOption3(updatedQuestion.getOption3());
                existingQuestion.setOption4(updatedQuestion.getOption4());
                existingQuestion.setCategory(updatedQuestion.getCategory());
                existingQuestion.setRightAnswer(updatedQuestion.getRightAnswer());
                existingQuestion.setDifficultyLevel(updatedQuestion.getDifficultyLevel());
                questionRepository.save(existingQuestion);
                return new ResponseEntity<>("Question updated successfully", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Question not found", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Something went wrong", HttpStatus.BAD_REQUEST);
    }

    // Delete a question by name
    public ResponseEntity<String> deleteQuestionByName(String name) {
        try {
            List<Question> questions = questionRepository.findByQuestionTitle(name);
            if (!questions.isEmpty()) {
                questionRepository.deleteAll(questions);
                return new ResponseEntity<>("Questions with name '" + name + "' deleted successfully", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Question with name '" + name + "' not found", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Something went wrong", HttpStatus.BAD_REQUEST);
    }

    // Delete a question by ID
    public ResponseEntity<String> deleteQuestionById(Integer id) {
        try {
            if (questionRepository.existsById(id)) {
                questionRepository.deleteById(id);
                return new ResponseEntity<>("Question deleted successfully", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Question with ID " + id + " not found", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Something went wrong", HttpStatus.BAD_REQUEST);
    }
}

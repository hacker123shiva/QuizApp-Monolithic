package com.telusko.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.telusko.entities.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    public List<Question> findByCategory(String category);
    
    public List<Question> findByQuestionTitle(String questionTitle);
    

    // Native query to find random questions by category
    @Query(value = "SELECT * FROM question WHERE category = :category ORDER BY RAND() LIMIT :numQ", nativeQuery = true)
    public List<Question> findRandomQuestionsByCategory(@Param("category") String category, @Param("numQ") int numQ);
}

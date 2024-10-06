package com.telusko.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.entities.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer>{

}

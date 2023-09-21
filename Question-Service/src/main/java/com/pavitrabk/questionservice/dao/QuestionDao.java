package com.pavitrabk.questionservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pavitrabk.questionservice.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer>{

	List<Question> findAll();
	List<Question> findByCategory(String category);
	
	@Query(nativeQuery = true, value = "SELECT q.id FROM question q Where q.category=:category ORDER BY RAND() LIMIT :numQ")
	List<Integer> findRandomQuestionsByCategory(String category, int numQ);

	
	
}

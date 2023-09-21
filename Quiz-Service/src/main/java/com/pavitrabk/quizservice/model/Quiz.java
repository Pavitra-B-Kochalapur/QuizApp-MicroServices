package com.pavitrabk.quizservice.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String title;
	
	@ElementCollection
	private List<Integer> questionIds;

}

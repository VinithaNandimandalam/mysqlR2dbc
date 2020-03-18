package com.webfluxPractise.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table("books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	@Id
	private Long id;
	private String title;
	private String author;

}

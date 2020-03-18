package com.webfluxPractise.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webfluxPractise.repository.BookRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class BookController {

	private BookRepository repo;

@GetMapping(value="/books")
public Mono<Long> getAllBooks(){
	Mono<Long> count=repo.count();
	System.out.println(count);
	return count;
}
}

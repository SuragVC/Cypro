package com.cypro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/url")
	private ResponseEntity<String> testAll() {
		return new ResponseEntity<String>("Working",HttpStatus.OK);

	}
	@GetMapping("/admin")
	private ResponseEntity<String> testAdmin() {
		return new ResponseEntity<String>("Working Admin",HttpStatus.OK);

	}
	@GetMapping("/user")
	private ResponseEntity<String> testCustomer() {
		return new ResponseEntity<String>("Working Customer",HttpStatus.OK);

	}
}

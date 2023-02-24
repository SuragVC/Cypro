package com.cypro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/done")
	public ResponseEntity<String>welcomeMessage(){
		return new ResponseEntity<String>( "Welcome",HttpStatus.OK);
	}

}

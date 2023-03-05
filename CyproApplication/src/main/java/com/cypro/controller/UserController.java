package com.cypro.controller;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cypro.entity.User;
import com.cypro.exception.UserException;
import com.cypro.services.UserServicesImpl;

import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/cypro")
public class UserController {
	private UserServicesImpl userServices;
	
	@Autowired
	public void setUserServices(UserServicesImpl userServices) {
		this.userServices = userServices;
	}
	@PostMapping("/signup")
	public ResponseEntity<User> signUpUser(@RequestBody @Valid User user) throws UserException{
		return new ResponseEntity<User>( userServices.addUser(user),HttpStatus.OK);
	}
	@GetMapping("/login")
	public ResponseEntity<User> logInUser(@Email String email,@NotNull @NotBlank String password) throws UserException{
		return new ResponseEntity<User>( userServices.logInUser(email, password),HttpStatus.OK);
	}
	
}

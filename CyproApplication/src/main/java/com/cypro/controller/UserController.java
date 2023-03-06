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

import com.cypro.entity.Customer;
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
	public ResponseEntity<Customer> signUpUser(@RequestBody @Valid Customer user) throws UserException{
		return new ResponseEntity<Customer>( userServices.addUser(user),HttpStatus.OK);
	}
	@GetMapping("/login")
	public ResponseEntity<Customer> logInUser(@Email String email,@NotNull @NotBlank String password) throws UserException{
		return new ResponseEntity<Customer>( userServices.logInUser(email, password),HttpStatus.OK);
	}
	
}

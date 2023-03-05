package com.cypro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	@PostMapping("/save")
	public ResponseEntity<User> addUser(@RequestBody @Valid User user) throws UserException{
		return new ResponseEntity<User>( userServices.addUser(user),HttpStatus.OK);
	}
	
}

package com.cypro.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class GlobalExceptionHandler {
		
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> MobileNumberException(MethodArgumentNotValidException loginException ){
		MyErrorDetails errorDetails = new MyErrorDetails(LocalDateTime.now(),"valadiation error",loginException.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<MyErrorDetails>(errorDetails,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> Exceptions(Exception exception , WebRequest request){
		MyErrorDetails errorDetails = new MyErrorDetails(LocalDateTime.now(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(errorDetails,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetails> userException(UserException exception , WebRequest request){
		MyErrorDetails errorDetails = new MyErrorDetails(LocalDateTime.now(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(errorDetails,HttpStatus.BAD_REQUEST);
	}
	

}

package com.cypro.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Admin implements UserInterface{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long adminId;
	
	@NotNull
	private String adminName;
	
	@NotNull
	private String password;
	
	@NotNull
	@Email
	private String email;
	
	private String role = "ADMIN";

}


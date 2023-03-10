package com.cypro.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Customer{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	
	@NotNull
	private String customerName;
	
	@NotNull
	private String password;
	
	@NotNull
	@Email
	private String email;
	
	@NotNull
	@NotBlank
	@Size(min=10,max=10,message="Mobile no must be 10 digits!")
	@Pattern(regexp = "\\d+", message="Mobile number should be digits only!")
	private String mobileNo;
	@OneToOne
	@JsonIgnore
	private Wallet wallet;
	@OneToOne
	@JsonIgnore
	private Cart cart;
}

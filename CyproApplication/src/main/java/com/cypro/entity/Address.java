package com.cypro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Address {
	@Id
	private Integer addressId;
	@NotNull
	private String city;
	@NotNull
	private String pincode;
	@NotNull
	private String address;
	@NotNull
	private String state;
	@NotNull
	private String country;
}

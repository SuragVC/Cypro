package com.cypro.entity;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {
	@Id
	private Integer purchaseId;
	private Date purchaseDate;
	private LocalTime purchaseTime;
	private Double totalAmount;
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Address address;
	@JsonIgnore
	@OneToMany(mappedBy = "purchase",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Product> products;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="walletId")
	private Wallet wallet;

}

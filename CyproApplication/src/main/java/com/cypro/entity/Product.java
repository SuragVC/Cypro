package com.cypro.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
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
@Table(name="Products")
public class Product {
	@Id
	private Integer productId;
	@NotNull
	@NotBlank
	private String name;
	private Double price;
	@NotNull
	private String details;
	@ManyToOne
	@JoinColumn(name="purchaseId")
	@JsonIgnore
	private Purchase purchase;
}

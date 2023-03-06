package com.cypro.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Wallet {
	@Id
	private Integer walletId;
	@OneToMany(mappedBy = "wallet",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Purchase> purchases;
}

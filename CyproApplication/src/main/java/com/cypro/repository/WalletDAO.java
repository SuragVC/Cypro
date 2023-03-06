package com.cypro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cypro.entity.Wallet;

public interface WalletDAO extends JpaRepository<Wallet, Integer>{

}

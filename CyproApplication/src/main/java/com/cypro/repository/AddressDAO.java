package com.cypro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cypro.entity.Address;

public interface AddressDAO extends JpaRepository<Address, Integer>{

}

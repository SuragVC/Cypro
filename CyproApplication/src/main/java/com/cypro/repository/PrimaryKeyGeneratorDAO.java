package com.cypro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cypro.entity.PrimaryKeyGenerator;

public interface PrimaryKeyGeneratorDAO extends JpaRepository<PrimaryKeyGenerator, Integer>{

}

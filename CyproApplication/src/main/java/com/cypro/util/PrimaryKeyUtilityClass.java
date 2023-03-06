package com.cypro.util;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.cypro.entity.PrimaryKeyGenerator;
import com.cypro.repository.PrimaryKeyGeneratorDAO;

import jakarta.annotation.PostConstruct;

@Component
public class PrimaryKeyUtilityClass {
	private PrimaryKeyGeneratorDAO primaryKeyGeneratorDao;
	@Autowired
	public  PrimaryKeyUtilityClass(PrimaryKeyGeneratorDAO primaryKeyGeneratorDao) {
		this.primaryKeyGeneratorDao=primaryKeyGeneratorDao;
	}
	@PostConstruct
    public void init() {
		Optional<PrimaryKeyGenerator> keyObjectOpt=primaryKeyGeneratorDao.findById(1L);
		if(keyObjectOpt.isEmpty()) {
			Long id=(long)1;
			Long key=(long)1;
			PrimaryKeyGenerator keyObject=new PrimaryKeyGenerator(id,key);
			primaryKeyGeneratorDao.save(keyObject);
		}
    }
	@Bean
	public Long primaryKey() {
		Optional<PrimaryKeyGenerator> keyObjectOpt=primaryKeyGeneratorDao.findById(1L);
		PrimaryKeyGenerator primaryKey=keyObjectOpt.get();
		Long key = primaryKey.getNextValue();
		PrimaryKeyGenerator keyObject=new PrimaryKeyGenerator(1L,key++);
		primaryKeyGeneratorDao.save(keyObject);
		return key;
	}
}


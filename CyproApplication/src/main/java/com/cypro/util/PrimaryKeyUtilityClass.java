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
		Optional<PrimaryKeyGenerator> keyObjectOpt=primaryKeyGeneratorDao.findById(1);
		if(keyObjectOpt.isEmpty()) {
			Integer id=1;
			Integer key=1;
			PrimaryKeyGenerator keyObject=new PrimaryKeyGenerator(id,key);
			primaryKeyGeneratorDao.save(keyObject);
		}
    }
	@Bean
	public Integer primaryKey() {
		Optional<PrimaryKeyGenerator> keyObjectOpt=primaryKeyGeneratorDao.findById(1);
		PrimaryKeyGenerator primaryKey=keyObjectOpt.get();
		Integer key = primaryKey.getNextValue();
		Integer nextValue=key+1;
		primaryKey.setNextValue(nextValue);
		primaryKeyGeneratorDao.save(primaryKey);
		return key;
	}
}


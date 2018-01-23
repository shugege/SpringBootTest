package com.chenshu.repository;

import org.springframework.data.repository.Repository;

import com.chenshu.entity.Cat;

public interface Cat2Repository extends Repository<Cat, Integer>{
	
	public Cat findByCatName(String catName);

}

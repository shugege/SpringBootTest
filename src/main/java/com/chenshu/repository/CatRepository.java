package com.chenshu.repository;

import org.springframework.data.repository.CrudRepository;

import com.chenshu.entity.Cat;

public interface CatRepository extends CrudRepository<Cat, Integer>{
	

}

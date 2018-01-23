package com.chenshu.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.chenshu.entity.Cat;
import com.chenshu.repository.Cat2Repository;
import com.chenshu.repository.CatRepository;

@Service
public class CatService {
	
	@Resource
	private CatRepository catRepository;
	
	@Resource
	private Cat2Repository cat2Repository;
	
	@Transactional
	public void save(Cat cat) {
		catRepository.save(cat);
	}
	
	@Transactional
	public void delete(int id) {
		catRepository.delete(id);
	}
	
	public Iterable<Cat> getAll() {
		return catRepository.findAll();
	}
	
	public Cat findByCatName(String catName) {
		return cat2Repository.findByCatName(catName);
	}

}

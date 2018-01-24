package com.chenshu.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.chenshu.dao.CatDAO;
import com.chenshu.entity.Cat;
import com.chenshu.repository.Cat2Repository;
import com.chenshu.repository.CatRepository;

@Service
public class CatService {
	
	@Resource
	private CatRepository catRepository;
	
	@Resource
	private Cat2Repository cat2Repository;
	
	@Resource
	private CatDAO catDAO;
	
	@Transactional
	public void save(Cat cat) {
		//先查询是否有重名
		String catName = cat.getCatName();
		int count = catDAO.queryCount(catName);
		System.out.println(count);
		if(count > 0) {
			catName += count;
			cat.setCatName(catName);
		}
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
	
	public Cat queryByCatName(String catName) {
//		int count = catDAO.queryCount(catName);
//		if(count > 0 ) {
			return catDAO.queryByCatName(catName);
//		} 
//		return null;
	}
	
}

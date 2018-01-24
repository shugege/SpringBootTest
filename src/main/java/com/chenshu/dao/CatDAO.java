package com.chenshu.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.chenshu.entity.Cat;

@Repository
public class CatDAO {
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);
	
	public Cat queryByCatName(String catName) {
		String sql = "SELECT * FROM CAT WHERE CAT_NAME = ?";
		Cat cat = jdbcTemplate.queryForObject(sql, new Object[]{catName}, rowMapper);
		return cat;
	}

	public Integer queryCount(String catName) {
		String sql = "SELECT COUNT(1) FROM CAT WHERE CAT_NAME LIKE '%' || ? || '%' ";
		return jdbcTemplate.queryForObject(sql, new Object[]{catName},Integer.class);
	}

}

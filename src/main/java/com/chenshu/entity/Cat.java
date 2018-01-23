package com.chenshu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity //实体类的持久化操作
public class Cat {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqhilo")
	@SequenceGenerator(sequenceName="GID_COLUMN_SEQ",name="seqhilo",allocationSize=1)
	private int id;
	
	private String catName;
	
	private int catAge;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public int getCatAge() {
		return catAge;
	}

	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
	
}

package com.chenshu.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/templates")
public class TemplatesController {
	
	@RequestMapping("/hello")
	public String hello(Map<String ,Object> map) {
		map.put("name", "jack");
		return "hello";
	}
	
	@RequestMapping("/helloFtl")
	public String helloFtl(Map<String,Object> map) {
		map.put("name", "andy");
		return "helloFtl";
	}

}

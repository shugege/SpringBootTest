package com.chenshu;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello-2018-01";
	}
	
	@RequestMapping("/hello2")
	public String hello2() {
		return "hello-2018";
	}
	
	@RequestMapping("/getDemo")
	public Demo getDemo() {
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("shugege");
		demo.setCreateTime(new Date());
		demo.setRemarks("这个字段值会显示吗");
		return demo;
	}

}

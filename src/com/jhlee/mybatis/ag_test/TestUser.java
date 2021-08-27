package com.jhlee.mybatis.ag_test;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;


public class TestUser implements TestDAO_IF  {
	
	private SqlSessionTemplate sqlSessionTemplate;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	
	@Override
	public void insertUser() {
		HashMap<String, Object> inputMap = new HashMap<String, Object>();
		User user = new User();
		inputMap.put("lastName", "홍");
		inputMap.put("firstName", "길동");
		sqlSessionTemplate.insert("insertUser", inputMap);
		System.out.println("새 Id : " + inputMap.get("id"));
	}


}

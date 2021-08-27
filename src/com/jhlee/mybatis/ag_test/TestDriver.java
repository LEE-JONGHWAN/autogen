package com.jhlee.mybatis.ag_test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDriver {
	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext(
					new String[] { "applicationContext-myBatis.xml" });
			TestUser tester = (TestUser) appContext.getBean("testUser");

			tester.insertUser();
			appContext.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

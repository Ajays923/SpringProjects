package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StrategyDPTest {
	public static void main(String[] args) {
		
		// Create IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get Target Bean class object
		/*
		 Flipkart fpkt = ctx.getBean("fpkt",Flipkart.class);
		//Flipkart fpkt = ctx.getBean("flipkart",Flipkart.class);
		// inovke b. method
		String result=fpkt.shopping(new String[]{"Mangoes","KIVI","Watermelon"},
									new float[] {900.0f,400.0f,500.0f});
		
		System.out.println(result);
		*/
	}
}

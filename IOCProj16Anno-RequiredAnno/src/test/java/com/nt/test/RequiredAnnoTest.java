package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Robot;

public class RequiredAnnoTest {

	public static void main(String[] args) {
		// create IOC Container
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get beans
		Robot robot = ctx.getBean("robot",Robot.class);
		System.out.println(robot);
		

	}

}

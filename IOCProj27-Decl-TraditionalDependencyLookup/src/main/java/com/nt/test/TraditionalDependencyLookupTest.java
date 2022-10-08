package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class TraditionalDependencyLookupTest {

	public static void main(String[] args) {
		
		// create IOC Container
		 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 //get target spring bean class object
		 Cricketer cricketer = ctx.getBean("cktr", Cricketer.class);
		 // invoke methods b.methods
		 cricketer.batting();
		 cricketer.bowling();
		 cricketer.fielding();
		 
		 // close container
		 ctx.close();
	}

}

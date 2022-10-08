package com.nt.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {
	
	private String batid;

	public Cricketer(String batid) {
		System.out.println("Cricketer::1-param constructor");
		this.batid = batid;
	}
	public void fielding() {
		System.out.println("Cricketer.fielding()");
	}
	public void bowling() {
		System.out.println("Cricketer.bowling()");
	}
	public void wicketKeeping() {
		System.out.println("Cricketer.wicketKeeping()");
	}
	
	public void batting() {
		System.out.println("Cricketer.batting()");
		// create an extra IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("Cricketer :: 2nd IOC Container created");
		//perform Dependency Lookup to get Dependent class
		CricketBat bat=ctx.getBean(batid, CricketBat.class); // Dependency Lookup
		//use Dependent class obj
		int runs = bat.scoreRuns();
		System.out.println("Cricketer is doing batting and his current score is "+runs);
		
		
	}
	
	
}

package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoterVerifier;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		// IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get spring class object
		VoterVerifier voter = ctx.getBean("voter",VoterVerifier.class);
		
		// inovke b methods
		try {
			System.out.println(voter.checkVotingEligibility());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

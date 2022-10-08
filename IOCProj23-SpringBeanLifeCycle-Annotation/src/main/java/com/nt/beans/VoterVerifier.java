package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("voter")
public class VoterVerifier{
		
		@Value("${vt.name}")
		private String name;
		@Value("${vt.age}")
		private float age;
		private Date VerificationDate;
		
		
		public VoterVerifier() {
			System.out.println("VoterVerifier:: 0-param constructor");
		}
		@PostConstruct
		public void ourInit() {
			System.out.println("VoterVerifier.ourInit() (Custome init method)");
			VerificationDate = new Date();
			// validation
			if(name==null || age <=0)
				throw new IllegalArgumentException("Invalid input are given to name , age");
		}

		@PreDestroy
		public void ourDestroy() {
			System.out.println("VoterVerifier.ourDestroy()");
			// nullifying bean properties
			name = null;
			age =0;
			VerificationDate = null;
		}	
		/*
		@Override
		public void destroy() throws Exception {
			System.out.println("VoterVerifier:: Destroy()");
			// nullifying bean properties
			name = null;
			age =0;
			VerificationDate = null;
			
		}*/
		/*
		@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("VoterVerifier:: afterPropertiesSet()");
			VerificationDate = new Date();
			// validation
			if(name==null || age <=0)
				throw new IllegalArgumentException("Invalid input are given to name , age");
			
		}*/
		
		//init life cycle method/ custome init method
		/*public void myInit() {
			System.out.println("VoterVerifier.myInit() (Custome init method)");
			VerificationDate = new Date();
			// validation
			if(name==null || age <=0)
				throw new IllegalArgumentException("Invalid input are given to name , age");
		}*/
		
		// destroy method
		/*public void myDestroy() {
			System.out.println("VoterVerifier.myDestroy()");
			// nullifying bean properties
			name = null;
			age =0;
			VerificationDate = null;
		}*/
		// b. methods
		public String checkVotingEligibility() {
			if(age < 18)
				return "Mr/Miss/Mrs. "+name+" you are not eligible for voting... wait "+(18-age)+" years to cast u r vote on -->"+VerificationDate;
			else
				return "Mr/Miss/Mrs. "+name+" you are eligible for voting --> "+VerificationDate;
		}
		
}

package com.nt.beans;

import java.util.Date;

public class VoterVerifier {
		private String name;
		private float age;
		private Date VerificationDate;
		
		
		public VoterVerifier() {
			System.out.println("VoterVerifier:: 0-param constructor");
		}
		// setters methods for setter injection
		public void setName(String name) {
			System.out.println("VoterVerifier.setName()");
			this.name = name;
		}
		public void setAge(float age) {
			System.out.println("VoterVerifier.setAge()");
			this.age = age;
		}
		
		//init life cycle method/ custome init method
		public void myInit() {
			System.out.println("VoterVerifier.myInit() (Custome init method)");
			VerificationDate = new Date();
			// validation
			if(name==null || age <=0)
				throw new IllegalArgumentException("Invalid input are given to name , age");
		}
		
		// destroy method
		public void myDestroy() {
			System.out.println("VoterVerifier.myDestroy()");
			// nullifying bean properties
			name = null;
			age =0;
			VerificationDate = null;
		}
		// b. methods
		public String checkVotingEligibility() {
			if(age < 18)
				return "Mr/Miss/Mrs. "+name+" you are not eligible for voting... wait "+(18-age)+" years to cast u r vote on -->"+VerificationDate;
			else
				return "Mr/Miss/Mrs. "+name+" you are eligible for voting --> "+VerificationDate;
		}
}

package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
		private Date date;

		public WishMessageGenerator() {
			System.out.println("WishMessageGenerator: 0-param constructor");
		}
		
		// alt+shift+s,r -> select setters:: To get setter method
		public void setDate(Date date) {
			this.date = date;
		}


		// ctr+shift+s,o  --> to generate parameterize constructor
		public WishMessageGenerator(Date date) {
			System.out.println("WishMessageGenerator:: 1-param constructor");
				//systrac+ space : s.o.p(-) with default message
			this.date = date;
		}
		
		public String GenerateWishMessage(String user) {
			System.out.println("WishMessageGenerator.GenerateWishMessage()::"+date);
			int hour = date.getHours();
			if(hour <12)
				return "Good Morning: "+user;
			else if(hour < 16)
				return "Good Afternoon: "+user;
			else if(hour<20)
				return "Good Evening: "+user;
			else			
			return "Good night: "+user;
			
		}
	
		
		
}

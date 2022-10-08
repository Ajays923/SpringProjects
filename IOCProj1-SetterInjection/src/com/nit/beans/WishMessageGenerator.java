//WishMessageGenerator.java
package com.nit.beans;

import java.util.Date;

public class WishMessageGenerator {
		private Date date; // ctr+shift+o : to import pkg

		public WishMessageGenerator() {
			System.out.println("WishMessageGenerator:: 0-param constructor");
		}
		
		// alt+shift+s,r :: to generate setter method
		public void setDate(Date date) {
			System.out.println("WishMessageGenerator:: setDate(-)");
			this.date = date;
		}
		// b. method
		public String generateWishMessage(String user) {
			
			System.out.println("WishMessageGenerator:: 0-param constructor");
			// get current hour of the day
			int hour = date.getHours(); // 24 hrs Format
			if(hour<12)
				return "Good Morning: "+user;
			else if(hour<16)
				return "Good Afternoon: "+user;
			else if(hour<20)
				return "Good Evening: "+user;
			else
				return "Good Night: "+user;
			
		}
}

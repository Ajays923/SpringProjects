package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {
	
	//@Autowired
	//@Qualifier("dtdc")
	private Courier courier;
	

	public Flipkart(@Qualifier("fEx") Courier courier) {
		this.courier = courier;
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	
	//@Autowired
	//@Qualifier("bdart")
	public void assign(Courier courier) {
		System.out.println("Flipkart.assign()");
		this.courier  = courier;
	}


	//b.method
	public String shopping(String[] items,float[] prices) {
		float billAmt=0.0f;
		for(float p:prices)
			billAmt +=p; // billAmt=billAmt+p;
		// generate order id
		int oid= new Random().nextInt(1000);
		// use courier
		String msg = courier.deliver(oid);
		return Arrays.toString(items)+" with prices"+Arrays.toString(prices)+" having total billAmt Rs. "+billAmt+" \n :::"+msg;
	}
}
package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public final class Flipkart {
	
	@Autowired
	@Qualifier("fEx")
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
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

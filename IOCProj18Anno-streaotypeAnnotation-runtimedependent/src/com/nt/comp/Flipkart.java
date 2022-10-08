package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("fpkt")
@PropertySource(value={"com/nt/commons/info.properties"
				,"com/nt/commons/info1.properties"}
				)
public final class Flipkart {
	
	@Autowired
	@Qualifier("cr")
	private Courier courier;
	
	@Value("${fpt.info.url}")
	private String url;
	@Value("${fpt.info.age}")
	private int age;
	
	@Value("${os.name}")
	private String os;
	
	@Value("${Path}")
	private String pathValue;
	
	
	
	/*@Autowired
	//@Qualifier("cr")
	public void assign() {
		System.out.println(url+" "+age);
	}*/
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}

	//b.method
	public String shopping(String[] items,float[] prices) {
		System.out.println("Flipkart.shopping()::"+os + " "+ pathValue);
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

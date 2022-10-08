package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("Fflight")
public class firstFlight implements Courier {
	
	public firstFlight() {
		System.out.println("firstFlight:0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return "Delivering "+oid+" order id order product using FirstFlight Courier";
	}

}

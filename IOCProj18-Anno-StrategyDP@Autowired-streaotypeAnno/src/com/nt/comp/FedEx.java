package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("fEx")
public class FedEx implements Courier {
	
	public FedEx() {
		System.out.println("FedEx:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		return "Delivering "+oid+" order id order product using FedEx Courier";
	}
		
}

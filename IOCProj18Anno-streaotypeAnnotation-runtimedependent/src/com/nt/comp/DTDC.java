package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier{
	
	public DTDC() {
		System.out.println("DTDC:: 0-param constructo");
	}
	
	@Override
	public String deliver(int oid) {
		return "Delivering "+oid+" order id order product using DTDC Courier ";
	}
}

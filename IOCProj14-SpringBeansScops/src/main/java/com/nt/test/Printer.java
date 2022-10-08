package com.nt.test;

public class Printer {
	// static reference 
	private static Printer INSTANCE;	// RULE-2
	
	private Printer() {
		System.out.println("Printer:: 0 - param constrcutor");
	}
	
	// public static facory method
	public static Printer getInstance() {
		if(INSTANCE == null)
			INSTANCE = new Printer();
		return INSTANCE;
	}
	
	// b. methods
	public void print(String msg) {
		System.out.println(msg);
	}
}

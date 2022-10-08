package com.nt.sds;

public class SingletonClass {

	public static void main(String[] args) {
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		
		System.out.println("p1 "+p1.hashCode()+" p2 "+p2.hashCode());
		System.out.println("p1==p2? "+(p1==p2));
	}

}

package com.nt.comp;

public class Employee extends Person{
	private String desg;
	private float salary;
	// Has-A property(Composition)
	private Food food;
	
	
	public Employee(Food food) {
		System.out.println("Employee:: 1-param constructor");
		this.food = food;
	}


	@Override
	public void work() {
		System.out.println("Employee is work in Software Development and "+food);
	}
}

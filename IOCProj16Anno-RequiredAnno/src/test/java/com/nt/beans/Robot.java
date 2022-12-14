package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

public class Robot {
	private int id;
	private String name;
	private String lab;
	private double price;
	//generate setters
	@Required
	public void setId(int id) {
		System.out.println("Robot.setId()");
		this.id = id;
	}
	@Required
	public void setName(String name) {
		System.out.println("Robot.setName()");
		this.name = name;
	}
	public void setLab(String lab) {
		System.out.println("Robot.setLab()");
		this.lab = lab;
	}
	public void setPrice(double price) {
		System.out.println("Robot.setPrice()");
		this.price = price;
	}
	// generate toString
	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", lab=" + lab + ", price=" + price + "]";
	}
	
}

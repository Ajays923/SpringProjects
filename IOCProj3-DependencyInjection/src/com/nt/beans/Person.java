package com.nt.beans;

public class Person {
	// spring bean properties
	private int pid;
	private String pname;
	private String paddrs;
	private float income;
	
	// setters for setter Injection alt+shift+s,r
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPaddrs(String paddrs) {
		this.paddrs = paddrs;
	}
	public void setIncome(float income) {
		this.income = income;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", income=" + income + "]";
	}

		
	
}

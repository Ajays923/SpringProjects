package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	private String ename;
	private String eaddrs;
	private Float basic_salary;
	
	// setters and getters
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddrs() {
		return eaddrs;
	}
	public void setEaddrs(String eaddrs) {
		this.eaddrs = eaddrs;
	}
	public Float getBasic_salary() {
		return basic_salary;
	}
	public void setBasic_salary(Float basic_salary) {
		this.basic_salary = basic_salary;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [ename=" + ename + ", eaddrs=" + eaddrs + ", basic_salary=" + basic_salary + "]";
	}
}

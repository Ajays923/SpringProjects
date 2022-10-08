package com.nt.vo;

public class EmployeeVO {
	private String ename;
	private String eaddrs;
	private String basic_salary;
	
	// setters and getters alt+shift+s,r
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
	public String getBasic_salary() {
		return basic_salary;
	}
	public void setBasic_salary(String basic_salary) {
		this.basic_salary = basic_salary;
	}
	// toString(), alt+shift+s,s
	@Override
	public String toString() {
		return "EmployeeVO [ename=" + ename + ", eaddrs=" + eaddrs + ", basic_salary=" + basic_salary + "]";
	}
}

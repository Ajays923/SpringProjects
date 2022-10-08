package com.nt.bo;

public class EmployeeBO {
	private String ename;
	private String eaddrs;
	private Float basic_salary;
	private Float Gross_salary;
	private Float NetSalary;
	
	
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
	public Float getGross_salary() {
		return Gross_salary;
	}
	public void setGross_salary(Float gross_salary) {
		Gross_salary = gross_salary;
	}
	public Float getNetSalary() {
		return NetSalary;
	}
	public void setNetSalary(Float netSalary) {
		NetSalary = netSalary;
	}
	
	// toString()
	@Override
	public String toString() {
		return "EmployeeBO [ename=" + ename + ", eaddrs=" + eaddrs + ", basic_salary=" + basic_salary
				+ ", Gross_salary=" + Gross_salary + ", NetSalary=" + NetSalary + "]";
	}
}

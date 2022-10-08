package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
		IEmployeeDAO dao;

	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		System.out.println("EmployeeMgmtServiceImpl:: 1-param contructor");
		this.dao = dao;
	}

	@Override
	public String CalculateGrossSalaryAndNetSalary(EmployeeDTO dto) throws Exception {
			// calcualte Gross salary and NetSalary
		Float Gross_Salary = dto.getBasic_salary()+ ((dto.getBasic_salary()*40)/100);
		Float Net_Salary =	(Gross_Salary) - ((dto.getBasic_salary()*20)/100);
		
		EmployeeBO bo = new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setEaddrs(dto.getEaddrs());
		bo.setBasic_salary(dto.getBasic_salary());
		bo.setGross_salary(Gross_Salary);
		bo.setNetSalary(Net_Salary);
		// use DAO
		int count = dao.insert(bo);
		
		return count==1?"Employee Record insert Successfully. --> Gross Salary: "+Gross_Salary:" Employee Record not insert";
	}

}

package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtService;
import com.nt.vo.EmployeeVO;

public class MainController {
	private IEmployeeMgmtService  service;

	public MainController(IEmployeeMgmtService service) {
		System.out.println("MainController:: 1-param constructor");
		this.service = service;
	}
	
	public String processGrossSalaryAndNetSalary(EmployeeVO vo) throws Exception{
			// Convert VO class into dto
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setEaddrs(vo.getEaddrs());
		dto.setBasic_salary(Float.parseFloat(vo.getBasic_salary()));
		
		// use service
		
		String result = service.CalculateGrossSalaryAndNetSalary(dto);
		
		return result;
	}
	

}

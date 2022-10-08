package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainController {
	private ICustomerMgmtService service;

	public MainController(ICustomerMgmtService service) {
		System.out.println("MainController:: 1-param constructor");
		this.service = service;
	}
	
	public String processCoronaPatientBill(CustomerVO vo ) throws Exception {
		// Convert VO class object into DTO class
		CustomerDTO dto = new CustomerDTO();
		dto.setPatientName(vo.getPatientName());
		dto.setPatientAddrs(vo.getPatientAddrs());
		dto.setMobile_Number(Float.parseFloat(vo.getMobile_Number()));
		dto.setBill_Per_Day(Float.parseFloat(vo.getBill_Per_Day()));
		dto.setNo_Of_patientHospitalized(Float.parseFloat(vo.getNo_Of_patientHospitalized()));
		
		// use service
		String result = service.CalculateCoronaPatientBill(dto);
		return result;
		
	}
	
}

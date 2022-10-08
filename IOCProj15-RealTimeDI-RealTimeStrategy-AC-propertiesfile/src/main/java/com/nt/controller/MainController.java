package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainController {
	private ICustomerMgmtService service;
	
	public MainController(ICustomerMgmtService service) {
		System.out.println("Main controller:1-param constructor");
		this.service = service;
	}
		
	public String processCustomer(CustomerVO vo) throws Exception {
		// Convert VO class obj data DTO clas object
			CustomerDTO dto = new CustomerDTO();
			dto.setCustName(vo.getCustName());
			dto.setCustAddrs(vo.getCustAddrs());
			dto.setPamt(Float.parseFloat(vo.getPamt()));  // Converting Float to String
			dto.setRate(Float.parseFloat(vo.getRate()));
			dto.setTime(Float.parseFloat(vo.getTime()));
		
		// use service
			String result = service.calculateSimpleInterest(dto);
		
		return result;
	}
}

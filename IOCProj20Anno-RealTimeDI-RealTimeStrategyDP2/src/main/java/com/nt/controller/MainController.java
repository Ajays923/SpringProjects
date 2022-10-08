package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

@Controller("controller")
public class MainController {
	@Autowired
	private ICustomerMgmtService service;
	
		
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

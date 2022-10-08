package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public final class CustomerMgmtServiceImple implements ICustomerMgmtService {
	private ICustomerDAO dao; // HAS-A PROPERTY
	
	public CustomerMgmtServiceImple(ICustomerDAO dao) {
		System.out.println("CustomerMgmtServiceImple:: 1- param constructor ");
		this.dao = dao;
	}

	@Override
	public String calculateSimpleInterest(CustomerDTO dto) throws Exception {
		// calculate simple interest amount
		Float intAmt = (dto.getPamt()*dto.getTime()*dto.getRate())/100.0f;
		//create Bo class obj having persistable data
		CustomerBO bo=new CustomerBO();
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setPmat(dto.getPamt());
		bo.setTime(dto.getTime());
		bo.setRate(dto.getRate());
		bo.setInterestAmount(intAmt);
		
		// use DAO
		int count = dao.insert(bo);
		// ternary operator  <condition>?<success_msg>:<failed_msg>;
		return count==1?"Customer Registered Successfully--> SimpleInterest Amount ::"+intAmt:"Customer Registration Failed";
	}

}

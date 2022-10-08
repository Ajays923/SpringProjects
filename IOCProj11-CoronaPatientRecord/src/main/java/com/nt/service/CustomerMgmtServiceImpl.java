package com.nt.service;

import com.nt.bo.CustomerBo;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
		ICustomerDAO dao;
	
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
			System.out.println("CustomerMgmtServiceImpl:: 1-param constructor");
			this.dao = dao;
		}

	@Override
	public String CalculateCoronaPatientBill(CustomerDTO dto) throws Exception {
		// calculate Corona patient Bill
		Float TotalBill =(dto.getBill_Per_Day()*dto.getNo_Of_patientHospitalized());
		Float discount = 0.0f;			// TotalBill - 5000 * 10 = 50000 
		//Float discount1 = 0.1f;
		//Float discount2 = 0.2f;
		Float netBills = 0.0f;		
		if(TotalBill >= 100000 && TotalBill <= 200000) {
			discount=10.0f;
			netBills = (TotalBill * discount)/100.0f;
			}
		else if(TotalBill >= 200000){
			discount=20.0f;
			netBills = (TotalBill * discount)/100.0f;	
		}
		else {
			 netBills = netBills + discount;
		}
			
		
		Float netBill = TotalBill - netBills;
		// create BO class obj having persiistant data
		CustomerBo bo = new CustomerBo();
		bo.setPatientName(dto.getPatientName());
		bo.setPatientAddrs(dto.getPatientAddrs());
		bo.setMobile_Number(dto.getMobile_Number());
		bo.setNo_Of_patientHospitalized(dto.getNo_Of_patientHospitalized());
		bo.setBill_Per_Day(dto.getBill_Per_Day());
		bo.setTotalBillAmt(TotalBill);
		bo.setDiscount(discount);
		//bo.setDiscount(discount1);
		//bo.setDiscount(discount2);
		bo.setNetBillAmt(netBill);
		
		// use DAO
		
		int count = dao.insert(bo);
		return count==1?"Corona Patient Record insert SuccessFully --> NetBills:: "+netBill:" Corona Patient Record Not Inserted";
	}

}

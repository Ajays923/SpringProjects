package com.nt.bo;

public class CustomerBO {
	private String CustName;
	private String CustAddrs;
	private Float pmat;
	private Float time;
	private Float Rate;
	private Float InterestAmount;

	//set getter and setters , alt+shift+s,r
	
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getCustAddrs() {
		return CustAddrs;
	}
	public void setCustAddrs(String custAddrs) {
		CustAddrs = custAddrs;
	}
	public Float getPmat() {
		return pmat;
	}
	public void setPmat(Float pmat) {
		this.pmat = pmat;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	public Float getRate() {
		return Rate;
	}
	public void setRate(Float rate) {
		Rate = rate;
	}
	public Float getInterestAmount() {
		return InterestAmount;
	}
	public void setInterestAmount(Float interestAmount) {
		InterestAmount = interestAmount;
	}
	
	// generate toString()  , alt+shift+s,s
	@Override
	public String toString() {
		return "CustomerBO [CustName=" + CustName + ", CustAddrs=" + CustAddrs + ", pmat=" + pmat + ", time=" + time
				+ ", Rate=" + Rate + ", InterestAmount=" + InterestAmount + "]";
	}
	
	
}

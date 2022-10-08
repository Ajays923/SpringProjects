package com.nt.vo;

public class CustomerVO {
	private String PatientName;
	private String PatientAddrs;
	private String Mobile_Number;
	private String No_Of_patientHospitalized;
	private String Bill_Per_Day;
	
	// getters and setters
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public String getPatientAddrs() {
		return PatientAddrs;
	}
	public void setPatientAddrs(String patientAddrs) {
		PatientAddrs = patientAddrs;
	}
	public String getMobile_Number() {
		return Mobile_Number;
	}
	public void setMobile_Number(String mobile_Number) {
		Mobile_Number = mobile_Number;
	}
	public String getNo_Of_patientHospitalized() {
		return No_Of_patientHospitalized;
	}
	public void setNo_Of_patientHospitalized(String no_Of_patientHospitalized) {
		No_Of_patientHospitalized = no_Of_patientHospitalized;
	}
	public String getBill_Per_Day() {
		return Bill_Per_Day;
	}
	public void setBill_Per_Day(String bill_Per_Day) {
		Bill_Per_Day = bill_Per_Day;
	}
	
	// toString()
	@Override
	public String toString() {
		return "CustomerVO [PatientName=" + PatientName + ", PatientAddrs=" + PatientAddrs + ", Mobile_Number="
				+ Mobile_Number + ", No_Of_patientHospitalized=" + No_Of_patientHospitalized + ", Bill_Per_Day="
				+ Bill_Per_Day + "]";
	}
	
	
	
	
	
}

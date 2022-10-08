package com.nt.bo;

public class CustomerBo {
		private String PatientName;
		private String PatientAddrs;
		private Float Mobile_Number;
		private Float No_Of_patientHospitalized;
		private Float Bill_Per_Day;
		private Float TotalBillAmt;
		private Float discount;
		private Float netBillAmt;
			
		////getter and setters
		
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
		public Float getMobile_Number() {
			return Mobile_Number;
		}
		public void setMobile_Number(Float mobile_Number) {
			Mobile_Number = mobile_Number;
		}
		public Float getNo_Of_patientHospitalized() {
			return No_Of_patientHospitalized;
		}
		public void setNo_Of_patientHospitalized(Float no_Of_patientHospitalized) {
			No_Of_patientHospitalized = no_Of_patientHospitalized;
		}
		public Float getBill_Per_Day() {
			return Bill_Per_Day;
		}
		public void setBill_Per_Day(Float bill_Per_Day) {
			Bill_Per_Day = bill_Per_Day;
		}
		public Float getTotalBillAmt() {
			return TotalBillAmt;
		}
		public void setTotalBillAmt(Float totalBillAmt) {
			TotalBillAmt = totalBillAmt;
		}
		public Float getDiscount() {
			return discount;
		}
		public void setDiscount(Float discount) {
			this.discount = discount;
		}
		public Float getNetBillAmt() {
			return netBillAmt;
		}
		public void setNetBillAmt(Float netBillAmt) {
			this.netBillAmt = netBillAmt;
		}
		//toString()
		@Override
		public String toString() {
			return "CustomerBo [PatientName=" + PatientName + ", PatientAddrs=" + PatientAddrs + ", Mobile_Number="
					+ Mobile_Number + ", No_Of_patientHospitalized=" + No_Of_patientHospitalized + ", Bill_Per_Day="
					+ Bill_Per_Day + ", TotalBillAmt=" + TotalBillAmt + ", discount=" + discount + ", netBillAmt="
					+ netBillAmt + "]";
		}
		
		
		

}

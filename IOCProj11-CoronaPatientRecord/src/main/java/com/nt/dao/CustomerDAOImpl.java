package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBo;

public class CustomerDAOImpl implements ICustomerDAO {
	private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY="INSERT INTO CORONAPATIENTRECORD VALUES (PATIENTID_SEQ.NEXTVAL,?,?,?,?,?,?,?,?)";
	private DataSource ds;

	//Constructor // alt+shift+s,o
	public CustomerDAOImpl(DataSource ds) {
		System.out.println("CustomerDAOImpl:: 1-param constructor");
		this.ds = ds;
	}
	
	@Override
	public int insert(CustomerBo bo) throws Exception {
		Connection conn = null;
		PreparedStatement ps =null;
		int count=0;
		try {
			// get pooled JDBC conn object
			conn = ds.getConnection();
			// create prepareStatement object having pre-compiled SQL Query
			ps = conn.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY);
			// set query param values
			ps.setString(1,bo.getPatientName());
			ps.setString(2,bo.getPatientAddrs());
			ps.setFloat(3,bo.getMobile_Number());
			ps.setFloat(5,bo.getBill_Per_Day());
			ps.setFloat(4, bo.getNo_Of_patientHospitalized());
			ps.setFloat(6, bo.getTotalBillAmt());
			ps.setFloat(7, bo.getDiscount());
			ps.setFloat(8, bo.getNetBillAmt());
			
			// execute Query
			count = ps.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se; 	// Exception rethrowing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		// close jdbc obj
		finally {
			try {
			if(ps!=null)
				ps.close();
			}
			catch(Exception e) {
				e.printStackTrace();
				throw e;
			}
			try {
				if(conn!=null)
					conn.close();
				}
				catch(Exception e) {
					e.printStackTrace();
					throw e;
				}
		}// finally
		return count;
	}// method
}// class

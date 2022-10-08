package com.nt.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;
import com.nt.bo.CustomerBO;

public class CustomerOracleDAOImpl implements ICustomerDAO {
	private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY="INSERT INTO REALTIMEDI_CUSTOMER VALUES (CUST_SEQ.NEXTVAL,?,?,?,?,?,?)";
	private DataSource ds;

	//Constructor // alt+shift+s,o
	public CustomerOracleDAOImpl(DataSource ds) {
		System.out.println("CustomerDAOImpl:: 1-param constructor");
		this.ds = ds;
	}
	
	@Override
	public int insert(CustomerBO bo) throws Exception {
		Connection conn = null;
		PreparedStatement ps =null;
		int count=0;
		try {
			// get pooled JDBC conn object
			conn = ds.getConnection();
			// create prepareStatement object having pre-compiled SQL Query
			ps = conn.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY);
			// set query param values
			ps.setString(1,bo.getCustName());
			ps.setString(2,bo.getCustAddrs());
			ps.setFloat(3,bo.getPmat());
			ps.setFloat(4,bo.getTime());
			ps.setFloat(5,bo.getRate());
			ps.setFloat(6,bo.getInterestAmount());
			// execute Query
			count =ps.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;	// Exception rethrowing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;	// Exception rethrowing
		}
		finally {
			// close jdbc conn objs
			try {
				if(ps!=null) {
					ps.close();
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;// Exception rethrowing
			}
			try {
				if(conn!=null) {
					conn.close();
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;// Exception rethrowing
			}
		} // finally
		return count;
	}// methods
}//class

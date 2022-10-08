package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nt.bo.CustomerBO;

@Repository("custMySQLDAO")
public class CustomerMySqlDAOImpl implements ICustomerDAO {
	private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY="INSERT INTO REALTIMEDI_CUSTOMER"
						+ "(CUSTNAME,CUSTADDRS,PAMT,RATE,TIME,INTRAMOUNT) VALUES (?,?,?,?,?,?)"; 
	@Autowired
	//@Qualifier("mysqldmds")
	private DataSource ds;
	
	@Override
	public int insert(CustomerBO bo) throws Exception {
		int count=0;
		// get Pooled jdbc con object and created PreparedStatment obj
		try(Connection con = ds.getConnection();		// try with resource
			PreparedStatement ps = con.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY)){ 
			// set param values 
			ps.setString(1,bo.getCustName());
			ps.setString(2,bo.getCustAddrs());
			ps.setFloat(3, bo.getPmat());
			ps.setFloat(4, bo.getRate());
			ps.setFloat(5,bo.getTime());
			ps.setFloat(6,bo.getInterestAmount());
			// execute Query
			count = ps.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}

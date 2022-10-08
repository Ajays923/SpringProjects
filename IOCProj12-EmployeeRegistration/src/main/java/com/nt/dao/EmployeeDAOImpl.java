package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {
	public static final String Employee_Insert_Query = "INSERT INTO EMPLOYEE_REGISTRATION VALUES(EID_SEQ.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;
	
	public EmployeeDAOImpl(DataSource ds) {
		System.out.println("EmployeeDAOImpl:: 1- param constructor");
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		int count = 0;
		try {
			// get connection pooled obj
			conn = ds.getConnection();
			// create prepared statment having pre-compiled SQL Query
			ps = conn.prepareStatement(Employee_Insert_Query);
			// set param values
			ps.setString(1,bo.getEname());
			ps.setString(2,bo.getEaddrs());
			ps.setFloat(3, bo.getBasic_salary());
			ps.setFloat(4, bo.getGross_salary());
			ps.setFloat(5, bo.getNetSalary());
			
			// execute query
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
		//close jdbc conn
		finally {
			
			try {
				if(ps!=null)
					ps.close();
			}catch(Exception e) {
				e.printStackTrace();
				throw e;
			}
			try {
				if(conn!=null)
					conn.close();
			}catch(Exception e) {
				e.printStackTrace();
				throw e;
			}
		}// finally
		return count;
	}// method
}// class

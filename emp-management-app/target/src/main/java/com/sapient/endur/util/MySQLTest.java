package com.sapient.endur.util;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.sapient.endur.dao.EmployeeDAO;
import com.sapient.endur.dao.EmployeeDaoImpl;
import com.sapient.endur.model.Employee;

public class MySQLTest {
	private static Logger logger= Logger.getLogger(MySQLTest.class);
	private static EmployeeDAO employeeDAO = new EmployeeDaoImpl();
	
	public static void main(String[] args) {
		//		try {
		//			Connection connection= MySQLConnection.getConnection();			
		////			System.out.println("Transaction Isolation Level : "+ connection.getTransactionIsolation());
		//			logger.info("Transaction Isolation Level : "+ connection.getTransactionIsolation());
		//		} catch (SQLException e) {			
		////			e.printStackTrace();
		//			logger.error(e.getMessage(), e);
		//		}


		try {
			Employee employee= employeeDAO.getEmployeeById(1);
			System.out.println(employee);
		}catch (SQLException e) {			
			e.printStackTrace();
			logger.error(e.getMessage(), e);
		}
	}

}

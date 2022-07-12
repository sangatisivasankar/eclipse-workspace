package com.sapient.endur.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.sapient.endur.model.Employee;
import com.sapient.endur.util.MySQLConnection;

public class EmployeeDaoImpl implements EmployeeDAO{
	private Logger logger= Logger.getLogger(EmployeeDaoImpl.class);
	
	@Override
	public Integer addEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteEmployee(Integer empno) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(Integer empno) throws SQLException {
		try(
			Connection connection=MySQLConnection.getConnection();	
			PreparedStatement preparedStatement= 
							connection.prepareStatement(QueryMapper.GET_EMPLOYEE_BY_ID);
		){
			//replaced placeholder(?) with empno this method receives
			preparedStatement.setInt(1, empno);
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {
				Employee employee = new Employee();
				//read from ResultSet object and write into Employee object
				populateEmployee(employee,resultSet);
				logger.info("Returning employee details: "+ employee);
				return employee;
			}else {
				logger.warn("Invalid Empno");
				throw new SQLException("Invalid Empno");
			}
		}catch(SQLException e) {
			logger.error(e);
			throw e;
		}catch(Exception e) {
			logger.error(e);
			throw new SQLException(e);
		}		
	}

	private void populateEmployee(Employee employee, ResultSet resultSet) throws SQLException,Exception{
		employee.setEmpno(resultSet.getInt("empno"));
		employee.setEname(resultSet.getString("ename"));
		employee.setJob(resultSet.getString("job"));
		//convert java.sql.Date to java.time.LocalDate
		employee.setHiredate(resultSet.getDate("hiredate").toLocalDate());
		employee.setSal(resultSet.getDouble("sal"));
		employee.setEmail(resultSet.getString("email"));
		employee.setMobile(resultSet.getLong("mobile"));
		employee.setDname(resultSet.getString("dname"));
		
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}

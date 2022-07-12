package com.sapient.endur.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.sapient.endur.model.Employee;
import com.sapient.endur.util.MySQLConnection;

public class EmployeeDaoImpl implements EmployeeDAO{
	private Logger logger= Logger.getLogger(EmployeeDaoImpl.class);
	
	@Override
	public Integer addEmployee(Employee employee) throws SQLException {
		try(
			Connection connection= MySQLConnection.getConnection();	
			PreparedStatement preparedStatement= 
								connection.prepareStatement(QueryMapper.ADD_EMPLOYEE);				
		) {
			//replace placeholders with actual values
			preparedStatement.setString(1, employee.getEname());
			preparedStatement.setString(2, employee.getJob());
			//convert java.time.LocalDate to java.sql.Date
			preparedStatement.setDate(3, java.sql.Date.valueOf(employee.getHiredate()));
			preparedStatement.setDouble(4, employee.getSal());
			preparedStatement.setString(5, employee.getEmail());
			preparedStatement.setLong(6, employee.getMobile());
			preparedStatement.setString(7, employee.getDname());
			//executeUpdate() can be applied for all DML statements
			//this methods no. of rows affected
			int n = preparedStatement.executeUpdate();
			if(n>0) {
				logger.info("Employee added to database");
				//returns the empno of the new employee
				return getLatestEmployeeId();
			}else {				
				throw new SQLException("Unable add employee");
			}
		}catch(SQLException e) {
			logger.error(e);
			throw e;
		}catch(Exception e) {
			logger.error(e);
			throw new SQLException(e);
		}				
		
	}

	
	
	
	
	
	@Override
	public Integer deleteEmployee(Integer empno) throws SQLException {
		try(
				Connection connection=MySQLConnection.getConnection();	
				PreparedStatement preparedStatement= 
								connection.prepareStatement(QueryMapper.DELETE_EMPLOYEE);
			){
				//replaced placeholder(?) with empno this method receives
				preparedStatement.setInt(1, empno);
				int n = preparedStatement.executeUpdate();
				if(n>0) {
					return empno;
				}else {
					throw new SQLException("Unable to delete employee");
				}
				
			}catch(SQLException e) {
				logger.error(e);
				throw e;
			}catch(Exception e) {
				logger.error(e);
				throw new SQLException(e);
			}	
	}

	@Override
	public Integer updateEmployee(Employee employee) throws SQLException {
		try(
				Connection connection=MySQLConnection.getConnection();	
				PreparedStatement preparedStatement= 
								connection.prepareStatement(QueryMapper.UPDATE_EMPLOYEE);
			){
				//replaced placeholder(?) with empno this method receives
				preparedStatement.setString(1, employee.getJob());
				preparedStatement.setDouble(2, employee.getSal());
				preparedStatement.setDate(3, java.sql.Date.valueOf(employee.getHiredate()));
				preparedStatement.setString(4, employee.getEmail());
				preparedStatement.setLong(5, employee.getMobile());
				preparedStatement.setString(6, employee.getDname());
				preparedStatement.setInt(7, employee.getEmpno());				
				
				int n = preparedStatement.executeUpdate();
				if(n>0) {
					return employee.getEmpno();
				}else {
					throw new SQLException("Unable to update employee");
				}
				
			}catch(SQLException e) {
				logger.error(e);
				throw e;
			}catch(Exception e) {
				logger.error(e);
				throw new SQLException(e);
			}	
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
		try(
				Connection connection=MySQLConnection.getConnection();	
				Statement statement= connection.createStatement();
			){
				ResultSet resultSet= statement.executeQuery(QueryMapper.GET_ALL_EMPLOYEES);
				List<Employee> employeeList= new ArrayList<>();
				while(resultSet.next()) {
					Employee employee = new Employee();
					//read from ResultSet object and write into Employee object
					populateEmployee(employee,resultSet);
					employeeList.add(employee);				
				}
				if(employeeList.size()!=0) {
					logger.info("returning list of all employees");
					return employeeList;
				}else {
					logger.info("The table is empty");
					return null;
				}
			}catch(SQLException e) {
				logger.error(e);
				throw e;
			}catch(Exception e) {
				logger.error(e);
				throw new SQLException(e);
			}	
	}






	@Override
	public Integer getLatestEmployeeId() throws SQLException {
		try(
				Connection connection=MySQLConnection.getConnection();	
				Statement statement= connection.createStatement();
			){
				ResultSet resultSet= statement.executeQuery(QueryMapper.GET_LATEST_ID);
				if(resultSet.next()) {
					int id= resultSet.getInt(1);
					return id;
				}else {
					return null;
				}
		}catch(SQLException e) {
			logger.error(e);
			throw e;
		}catch(Exception e) {
			logger.error(e);
			throw new SQLException(e);
		}	
		
	}

}

package com.sapient.endur.dao;

import java.sql.SQLException;
import java.util.List;

import com.sapient.endur.model.Employee;

/**
 * 
 * @author Admin
 *  To perform CRUD operation on employee table
 */ 
public interface EmployeeDAO {
	public abstract Integer addEmployee(Employee employee) throws SQLException;
	public abstract Integer deleteEmployee(Integer empno) throws SQLException;
	public abstract Integer updateEmployee(Employee employee) throws SQLException;
	public abstract Employee getEmployeeById(Integer empno) throws SQLException;
	public abstract List<Employee> getAllEmployees() throws SQLException;
	
}

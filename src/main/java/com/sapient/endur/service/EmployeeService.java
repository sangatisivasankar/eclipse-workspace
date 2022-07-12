package com.sapient.endur.service;

import java.util.List;

import com.sapient.endur.model.Employee;

public interface EmployeeService {
	public abstract Integer addEmployee(Employee employee) throws EmployeeException;
	public abstract Integer deleteEmployee(Integer empno) throws EmployeeException;
	public abstract Integer updateEmployee(Employee employee) throws EmployeeException;
	public abstract Employee getEmployeeById(Integer empno) throws EmployeeException;
	public abstract List<Employee> getAllEmployees() throws EmployeeException;
	public abstract Integer getLatestEmployeeId() throws EmployeeException;
}

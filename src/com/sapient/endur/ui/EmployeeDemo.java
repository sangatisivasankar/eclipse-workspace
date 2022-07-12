package com.sapient.endur.ui;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sapient.endur.model.Employee;
public class EmployeeDemo {
	private static Employee employee[]=new Employee[4];
	static {
		employee[0]= new Employee(879672L,"Ravi Kumar","Developer","ravi@gmail.com",40000.0);
		employee[1]= new Employee(779875L,"Avinash","Tester","avvi@gmail.com",50000.0);
		employee[2]= new Employee(679876L,"Vinod Kumar","HR","vinod@gmail.com",45000.0);
		employee[3]= new Employee(879876L,"Madhavi","Tester","madhavi@gmail.com",60000.0);
		employee[4]= new Employee(999876L,"Jones","Developer","jones@gmail.com",40000.0);
	}
	public static List<Employee> getEmployeesOfGivenJob(List<Employee> employeesList, String job) {
		Stream<Employee> st = employeesList.stream();
		List<Employee> list = st
				.filter((f) -> f.getJob().equals(job))
				.collect(Collectors.toList());
		return list;
				
	}
	public static double getTotalSalary(List<Employee> employeesList) {
		Stream<Employee> st = employeesList.stream();
		double totolSalery = st
				.map( (c) -> c.getSalary())
				.reduce( (p1, p2) -> p1 + p2)
				.get();
		return totolSalery;
	}
	
}
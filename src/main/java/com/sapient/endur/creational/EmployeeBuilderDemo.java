package com.sapient.endur.creational;

import java.time.LocalDate;
/**
 * 
 * @author Admin
 *Creating Employee object using Builder design pattern
 */
public class EmployeeBuilderDemo {

	public static void main(String[] args) {
		Employee employee= Employee.builder().empno(1001).ename("Smith")
							.job("Manager").hiredate(LocalDate.of(2018, 10, 10))
							.sal(786500.0).comm(25000.0).deptno(10).build();
		System.out.println(employee);

	}

}





















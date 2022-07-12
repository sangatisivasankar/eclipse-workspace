package com.sapient.endur.creational;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Employee {
	private Integer empno;
	private String ename;
	private String job;
	private LocalDate hiredate;
	private Double sal;
	private Double comm;
	private Integer deptno;
	
	
	
	
}











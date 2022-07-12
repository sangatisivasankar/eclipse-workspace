package com.sapient.endur.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
	private Integer empno;
	private String ename;
	private String job;
	private LocalDate hiredate;
	private Double sal;
	private String email;
	private Long mobile;
	private String dname;
	
	
	
}

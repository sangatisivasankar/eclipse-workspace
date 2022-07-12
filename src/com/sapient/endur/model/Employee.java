package com.sapient.endur.model;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
	private Long empid;
	private String ename;
	private String job;
	private String email;
	private double salary;
	public Employee(Long empid, String ename, String job, String email, double d) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.job = job;
		this.email = email;
		this.salary = d;
	}
	public Long getEmpid() {
		return empid;
	}
	public void setEmpid(Long empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", job=" + job + ", email=" + email + ", salary="
				+ salary + ", getEmpid()=" + getEmpid() + ", getEname()=" + getEname() + ", getJob()=" + getJob()
				+ ", getEmail()=" + getEmail() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
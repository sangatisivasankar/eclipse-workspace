package com.sapient.endur.dao;
/*
 * For  DDL(create/drop/alter) and static queries: Statement interface
 * For  DML(insert/update/delete) and dynamic queries: PreparedStatement
 * For  calling sub-programs of MySQL: CallableStatement
 */
public interface QueryMapper {
	public static final String ADD_EMPLOYEE= 
					"insert into employee(ename,job,hiredate,sal,email,mobile,dname) values(?,?,?,?,?,?,?)";
	public static final String UPDATE_EMPLOYEE =
					"update employee set job=?,sal=?,hiredate=?,email=?,mobile=?,dname=? where empno=?";
	
	public static final String DELETE_EMPLOYEE= "delete from employee where empno=?";
	public static final String GET_EMPLOYEE_BY_ID= "select * from employee where empno=?";
	public static final String GET_ALL_EMPLOYEES= "select * from employee";
	public static final String GET_LATEST_ID = "select max(empno) from employee";
	
}

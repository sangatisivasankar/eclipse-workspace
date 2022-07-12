package com.sapient.endur.dao;
/*
 * For  DDL(create/drop/alter) and static queries: Statement interface
 * For  DML(insert/update/delete) and dynamic queries: PreparedStatement
 * For  calling sub-programs of MySQL: CallableStatement
 */
public interface QueryMapper {
	public static final String ADD_FAMILYMEMBER= 
					"insert into familyMember(familyMemberId,firstName,lastName,gender,suffix,birthdate,qualification,profession,hobbies,relation,username,familyHeadId) values(?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String UPDATE_FAMILYMEMBER =
					"update familyMember set familyMemberId=?,firstName=?,lastName=?,gender=?,suffix=?,birthdate=?,qualification=?,profession=?,hobbies=?,relation=?,username=? where familyHeadId=?";
	
	public static final String DELETE_FAMILYMEMBER= "delete from familyMember where familyHeadId=?";
	public static final String GET_FAMILYMEMBER_BY_ID= "select * from familyMember where familyHeadId=?";
	public static final String GET_ALL_FAMILYMEMBER= "select * from familyMember";
	public static final String GET_LATEST_FAMILYMEMBER_ID = "select max(familyHeadId) from familyMember";
	
	
}

package com.sapient.endur.dao;

import java.sql.SQLException;

import java.util.List;

import com.sapient.endur.model.FamilyMember;


public interface FamilyMemberDAO  {
	public abstract Integer addFamilyMember(FamilyMember familyMember) throws SQLException;
	public abstract Integer deleteFamilyMember(Integer familyMemberId) throws SQLException;
	public abstract Integer updateFamilyMember(FamilyMember familyMember) throws SQLException;
	public abstract FamilyMember getFamilyMemberById(Integer familyMemberId) throws SQLException;
	public abstract List<FamilyMember> getAllFamilyMembers() throws SQLException;
	public abstract Integer getLatestFamilyMemberId() throws SQLException;
	
}
package com.sapient.endur.dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.sapient.endur.model.FamilyMember;
import com.sapient.endur.util.MySQLConnection;

public class FamilyMemberDaoImpl implements FamilyMemberDAO{
	private Logger logger= Logger.getLogger(FamilyMemberDaoImpl.class);
	
	@Override
	public Integer addFamilyMember(FamilyMember familyMember) throws SQLException {
		try(
			Connection connection= MySQLConnection.getConnection();	
			PreparedStatement preparedStatement= 
								connection.prepareStatement(QueryMapper.ADD_FAMILYMEMBER);				
		) {
			
			preparedStatement.setInt(1, familyMember.getFamilyMemberId());
			preparedStatement.setString(2, familyMember.getFirstName());
			//convert java.time.LocalDate to java.sql.Date
			preparedStatement.setString(3, familyMember.getLastName());
			preparedStatement.setString(4, familyMember.getGender().toString());
			preparedStatement.setString(5, familyMember.getSuffix().toString());
			preparedStatement.setDate(6, java.sql.Date.valueOf(familyMember.getBirthdate()));
			Array qualificationArray=connection.createArrayOf("VARCHAR", familyMember.getQualification());
			preparedStatement.setArray(7, qualificationArray);
			preparedStatement.setString(8,familyMember.getProfession());
			Array hobbiesArray=connection.createArrayOf("VARCHAR", familyMember.getHobbies());
			preparedStatement.setArray(9, hobbiesArray);
			preparedStatement.setString(10,familyMember.getRelation().toString());
			preparedStatement.setString(11,familyMember.getUsername());
			preparedStatement.setInt(12,familyMember.getFamilyHeadId());
			//executeUpdate() can be applied for all DML statements
			//this methods no. of rows affected
			int n = preparedStatement.executeUpdate();
			if(n>0) {
				logger.info("FamilyMember added to database");
				
				return getLatestFamilyMemberId();
			}else {				
				throw new SQLException("Unable add familyMember");
			}
		}catch(SQLException e) {
			logger.error(e);
			throw e;
		}catch(Exception e) {
			logger.error(e);
			throw new SQLException(e);
		}				
		
	}

	
	
	
	
	
	@Override
	public Integer deleteFamilyMember(Integer familyMemberId) throws SQLException {
		try(
				Connection connection=MySQLConnection.getConnection();	
				PreparedStatement preparedStatement= 
								connection.prepareStatement(QueryMapper.DELETE_FAMILYMEMBER);
			){
				
				preparedStatement.setInt(1, familyMemberId);
				int n = preparedStatement.executeUpdate();
				if(n>0) {
					return familyMemberId;
				}else {
					throw new SQLException("Unable to delete familyMember");
				}
				
			}catch(SQLException e) {
				logger.error(e);
				throw e;
			}catch(Exception e) {
				logger.error(e);
				throw new SQLException(e);
			}	
	}

	@Override
	public Integer updateFamilyMember(FamilyMember familyMember) throws SQLException {
		try(
				Connection connection=MySQLConnection.getConnection();	
				PreparedStatement preparedStatement= 
								connection.prepareStatement(QueryMapper.UPDATE_FAMILYMEMBER);
			){
			
			preparedStatement.setInt(1, familyMember.getFamilyMemberId());
			preparedStatement.setString(2, familyMember.getFirstName());
			//convert java.time.LocalDate to java.sql.Date
			preparedStatement.setString(3, familyMember.getLastName());
			preparedStatement.setString(4, familyMember.getGender().name());
			preparedStatement.setString(5, familyMember.getSuffix().name());
			preparedStatement.setDate(6, java.sql.Date.valueOf(familyMember.getBirthdate()));
			Array qualificationArray=connection.createArrayOf("VARCHAR", familyMember.getQualification());
			preparedStatement.setArray(7, qualificationArray);
			preparedStatement.setString(8,familyMember.getProfession());
			Array hobbiesArray=connection.createArrayOf("VARCHAR", familyMember.getHobbies());
			preparedStatement.setArray(9, hobbiesArray);
			preparedStatement.setString(10,familyMember.getRelation().name());
			preparedStatement.setString(11,familyMember.getUsername());
			preparedStatement.setInt(12,familyMember.getFamilyHeadId());
							
				
				int n = preparedStatement.executeUpdate();
				if(n>0) {
					return familyMember.getFamilyMemberId();
				}else {
					throw new SQLException("Unable to update FamilyMemberId");
				}
				
			}catch(SQLException e) {
				logger.error(e);
				throw e;
			}catch(Exception e) {
				logger.error(e);
				throw new SQLException(e);
			}	
	}

	@Override
	public FamilyMember getFamilyMemberById(Integer familyMemberId) throws SQLException {
		try(
			Connection connection=MySQLConnection.getConnection();	
			PreparedStatement preparedStatement= 
							connection.prepareStatement(QueryMapper.GET_LATEST_FAMILYMEMBER_ID );
		){
			
			preparedStatement.setInt(1, familyMemberId);
			ResultSet resultSet= preparedStatement.executeQuery();
			resultSet.get
			if(resultSet.next()) {
				FamilyMemberId familyMemberId = new FamilyMemberId();
				//read from ResultSet object and write into Employee object
				populateFamilyMember(FamilyMember,resultSet);
				logger.info("Returning familyMember details: "+ familyMember);
				return familyMember;
			}else {
				logger.warn("Invalid FamilyMemberId");
				throw new SQLException("Invalid Empno");
			}
		}catch(SQLException e) {
			logger.error(e);
			throw e;
		}catch(Exception e) {
			logger.error(e);
			throw new SQLException(e);
		}		
	}

	
	  private void populateFamilyMember(FamilyMember familyMember, ResultSet
	  resultSet) throws SQLException,Exception{
	  familyMember.setFamilyMemberId(resultSet.getInt("familyMemberId"));
	  familyMember.setFirstName(resultSet.getString("firstName"));
	  familyMember.setLastName(resultSet.getString("lastName"));
	  familyMember.setGender(resultSet.getString("gender"));
	  familyMember.setSuffix(resultSet.getString("suffix")); //convert
	  java.sql.Date to java.time.LocalDate
	  familyMember.setBirthdate(resultSet.getDate("birthdate").toLocalDate());
	  familyMember.setQualification(resultSet.getString("qualification"));
	  familyMember.setProfession(resultSet.getString("Profession"));
	  familyMember.setHobbies(resultSet.getLong("hobbies"));
	  familyMember.setRelation(resultSet.getString("relation"));
	  familyMember.setusername(resultSet.getString("username"));
	  familyMember.setFamilyHeadId(resultSet.getInt("familyHeadId"));
	 
	 	}

	@Override
	public List<FamilyMember> getAllFamilyMembers() throws SQLException {
		try(
				Connection connection=MySQLConnection.getConnection();	
				Statement statement= connection.createStatement();
			){
				ResultSet resultSet= statement.executeQuery(QueryMapper.GET_LATEST_FAMILYMEMBER_ID);
				List<FamilyMember> familyMemberList= new ArrayList<>();
				while(resultSet.next()) {
					FamilyMember familyMember = new FamilyMember();
					//read from ResultSet object and write into Employee object
					populateFamilyMember(familyMember,resultSet);
					familyMemberList.add(familyMember);				
				}
				if(familyMemberList.size()!=0) {
					logger.info("returning list of all familyMembers");
					return familyMemberList;
				}else {
					logger.info("The table is empty");
					return null;
				}
			}catch(SQLException e) {
				logger.error(e);
				throw e;
			}catch(Exception e) {
				logger.error(e);
				throw new SQLException(e);
			}	
	}






	@Override
	public Integer getLatestFamilyMemberId() throws SQLException {
		try(
				Connection connection=MySQLConnection.getConnection();	
				Statement statement= connection.createStatement();
			){
				ResultSet resultSet= statement.executeQuery(QueryMapper.GET_LATEST_FAMILYMEMBER_ID);
				if(resultSet.next()) {
					int id= resultSet.getInt(1);
					return id;
				}else {
					return null;
				}
		}catch(SQLException e) {
			logger.error(e);
			throw e;
		}catch(Exception e) {
			logger.error(e);
			throw new SQLException(e);
		}	
		
	}






	



}



	



	
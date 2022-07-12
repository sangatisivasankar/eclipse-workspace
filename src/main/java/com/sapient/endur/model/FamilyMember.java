package com.sapient.endur.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class FamilyMember {
	private Integer familyMemberId;
	private String firstName;
	private String lastName ;
	private Gender gender;
	private Suffix suffix;
	private LocalDate birthdate;
	private String[] qualification;
	private String profession;
	private String[] hobbies;
	private Relation relation;
	private String username;
	private Integer familyHeadId;
	
	
}
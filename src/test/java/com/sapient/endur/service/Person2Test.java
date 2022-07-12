package com.sapient.endur.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Person2Test {
	private Person person=null;
	
	@BeforeEach
	void setUp() throws Exception {
		person=new Person("Rohit","Sharma");
	}

	@AfterEach
	void tearDown() throws Exception {
		person=null;
	}

	@Test
	void testGetFirstName() {
		assertEquals("Rohit",person.getFirstName());
	}

	@Test
	void testGetLastName() {
		assertEquals("Sharma", person.getLastName());
	}

}


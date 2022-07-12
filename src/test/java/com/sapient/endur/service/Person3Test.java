package com.sapient.endur.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest3 {
	private Person person=null;

	@BeforeEach
	void setUp() throws Exception {
		person= new Person();
	}

	@AfterEach
	void tearDown() throws Exception {
		person=null;
	}

	@Test
	void testSetFirstName() {
		person.setFirstName("Rishab");
		assertEquals("Rishab", person.getFirstName());
	}

	@Test
	void testSetLastName() {
		person.setLastName("Pant");
		assertEquals("Pant", person.getLastName());
	}

}




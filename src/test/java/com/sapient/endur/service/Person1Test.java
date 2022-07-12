package com.sapient.endur.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Person1Test {

	private Person person = null;
	
	@BeforeEach
	void setUp() throws Exception {
		person = new Person("Abhi", "Sah");
	}

	@AfterEach
	void tearDown() throws Exception {
		person = null;
	}

	@Test
	void testGetFirstName() {
		assertEquals("Abhi", person.getFirstName());
	}

	@Test
	void testGetLastName() {
		assertEquals("Sah", person.getLastName());
	}

	@Test
	void testSetFirstName() {
		person.setFirstName("Kunal");
		assertEquals("Kunal", person.getFirstName());
	}

	@Test
	void testSetLastName() {
		person.setLastName("Das");
		assertEquals("Das", person.getLastName());
	}

}
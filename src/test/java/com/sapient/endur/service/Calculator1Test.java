package com.sapient.endur.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Calculator1Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddNumber() {
		assertEquals(15,10+5);
	}

	@Test
	void testSubstractNumber() {
		assertEquals(6,16-10);

	}



}
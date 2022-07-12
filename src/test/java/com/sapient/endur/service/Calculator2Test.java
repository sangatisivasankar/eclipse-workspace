package com.sapient.endur.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Calculator2Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMultiplyNumber() {
		assertEquals(300, 10*30);
	}

	@Test
	void testDivideNumber() {
		assertEquals(5,50/10);
	}

}
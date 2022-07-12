package com.sapient.endur.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/*
 * The annotation @Tag is an identifier
 */
@Tag("Smoke Test")
class HelloTest {
	private Hello hello=null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("This method will execute before all test methods..");
	}


	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("This method wiil execute after all test methods..");
	}

	@BeforeEach
	void setUp() throws Exception {
		hello=new Hello();
	}

	@AfterEach
	void tearDown() throws Exception {
		hello=null;
	}

	@Test
	void testValidConstructorHello() {
		assertEquals("Hello", hello.getGreeting());
	}


	@Test
	void testInvalidConstructorHello() {
		assertNotEquals("Hello World", hello.getGreeting());
	}

	@Disabled
	@Test
	void testHelloString() {
		fail("Not yet implemented");
	}

	@DisplayName("Testing getter method on property, greeting")
	@Test
	void testValidGetGreeting() {
		hello= new Hello("Hello World");
		assertEquals("Hello World", hello.getGreeting());
	}

	@Test
	void testInvalidGetGreeting() {
		hello= new Hello("Hello World");
		assertNotEquals("Hello", hello.getGreeting());
	}

	@Test
	void testValidSetGreeting() {
		hello.setGreeting("Good Day");
		assertEquals("Good Day", hello.getGreeting());
	}

	@Test
	void testInvalidSetGreeting() {
		hello.setGreeting("Good Day");
		assertNotEquals("Hello", hello.getGreeting());
	}

	@ParameterizedTest
	@ValueSource(strings = {"Hello","Hello World","Hi","Good Day"})
	void testBeginsWithH(String greeting) {
		assertTrue(greeting.startsWith("H"));
	}

	@RepeatedTest(value = 5, name = "{displayName}	{currentRepetition}/{totalRepetitions}")
	@DisplayName("RepeatingTest")
	void customDisplayName(RepetitionInfo repInfo, TestInfo testInfo) {
		int i = 3;
		System.out.println(testInfo.getDisplayName() + "-->" +
				repInfo.getCurrentRepetition() );
		assertNotEquals(repInfo.getCurrentRepetition(), i);
	}

}






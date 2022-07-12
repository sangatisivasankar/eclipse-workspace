package com.sapient.endur.Suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("This is Person suite")
//@SelectClasses({PersonTest1.class,PersonTest2.class,PersonTest3.class})
@SelectPackages("com.sapient.endur.service")
public class PersonSuiteTest {
	
}





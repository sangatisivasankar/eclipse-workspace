package com.sapient.endur.ui;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectPackages("com.sapient.endur.service")
@SuiteDisplayName("Running All test cases")
public class TestSuite {
	
}
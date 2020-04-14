package com.example.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	private SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void softAssertsTest() {
		softAssert.assertEquals(1, 0);
		System.out.println("I was executed after assertion error.");
	}
	
	@AfterClass
	public void cleanUp() {
		softAssert.assertAll();
	}
	
}

package com.example.tests;

import org.testng.annotations.Test;

public class TestWithPriority {
	@Test(priority = 3)
	public void testA1() {
		System.out.println("testA1");
	}

	@Test(priority = 2)
	public void testA2() {
		System.out.println("testA2");
	}

	@Test(priority = 1)
	public void testA3() {
		System.out.println("testA3");
	}
}

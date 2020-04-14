package com.example.tests;

import org.testng.annotations.Test;

public class ParallelTest {
	private static int count;
	
	@Test(threadPoolSize = 3, invocationCount = 10,  timeOut = 10000)
	public void testServer() { 
		System.out.println("testServer" + count++);
	}

}

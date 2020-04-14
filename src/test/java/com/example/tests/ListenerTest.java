package com.example.tests;

import com.example.listeners.MyTestResultListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestResultListener.class)
public class ListenerTest {

	@Test
	public void customListenerTest() {
		Assert.assertTrue(false);
	}
	
}

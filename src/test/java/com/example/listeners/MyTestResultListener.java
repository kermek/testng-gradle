package com.example.listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyTestResultListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName() + ":");
        System.out.println("Custom test failure message");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // do what you want to do
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // do what you want to do
    }
}
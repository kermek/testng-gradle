package com.example.tests;

import org.testng.annotations.Test;

public class LoginTestWithGroups {
    @Test(groups = "Smoke")
    public void loginWithValidPasswordTest() {
        System.out.println("	First testcase");
    }

    @Test(groups = "Regression")
    public void loginWithInvalidPasswordTest() {
        System.out.println("Second testcase");
    }

    @Test(groups = {"IEOnly", "Smoke"})
    public void activeXTest() {
        System.out.println("Third testcase");
    }
}

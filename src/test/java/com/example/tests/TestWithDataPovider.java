package com.example.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestWithDataPovider {
    @DataProvider(name = "SearchProvider")
    public Object[][] getSearchData() {
        return new Object[][]{
                {"Lorem", "1 result"},
                {"Ipsum", "0 results"},
                {"Test", "5 results"}
        };
    }

    @Test(dataProvider = "SearchProvider")
    public void searchResultsCountTest(String query, String result) {
        System.out.println("Query " + query + " found " + result);
    }


    @Test(dataProvider = "SearchProvider", dataProviderClass = TestData.class)
    public void searchResults2CountTest(String query, String result) {
        System.out.println("Query " + query + " found " + result);
    }

    @DataProvider(name = "SearchProvider2")
    public Object[][] getSearchData2(Method m) {
        if (m.getName() == "searchResultsCount2Test") return new Object[][]{};
        return new Object[][]{
                {"Lorem", "1 result"},
                {"Ipsum", "0 results"},
                {"Test", "5 results"}
        };
    }
}

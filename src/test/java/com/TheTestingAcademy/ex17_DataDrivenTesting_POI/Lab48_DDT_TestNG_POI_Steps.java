package com.TheTestingAcademy.ex17_DataDrivenTesting_POI;

import com.TheTestingAcademy.CommonToAll;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab48_DDT_TestNG_POI_Steps extends CommonToAll {


    @Test(dataProvider = "getData")
    public void test_vwo_login(String email, String password) {
        System.out.println(email + " - " + password);
    }


    @DataProvider
    public Object[][] getData() {
        // Read the Excel File
        // COnvert the data R, C into the data[][]
        // return new Object[][];
        return null;
    }


}
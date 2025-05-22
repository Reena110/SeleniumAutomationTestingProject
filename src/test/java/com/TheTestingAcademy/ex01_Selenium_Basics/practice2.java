package com.TheTestingAcademy.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class practice2
{
    @Description(" Open the Vwo url and get the title of this page")
    @Test
    public void test_sele()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://app.vwo.com");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }
}

package com.TheTestingAcademy.ex01_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practice1
{
@Test
    public void test_vwo()
{
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://app.vwo.com");
    driver.quit();
}
}

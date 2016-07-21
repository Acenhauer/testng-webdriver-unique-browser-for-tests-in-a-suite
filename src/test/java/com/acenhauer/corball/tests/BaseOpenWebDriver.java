package com.acenhauer.corball.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by guillem on 21/07/16.
 */
public class BaseOpenWebDriver {

    public static WebDriver driver;

    @BeforeSuite
    public void setUp(){
        driver = new FirefoxDriver();
    }

    @AfterSuite
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}

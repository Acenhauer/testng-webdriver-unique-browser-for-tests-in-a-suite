package com.acenhauer.corball.tests;

import com.acenhauer.corball.selenium.BaseWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by guillemhs on 2015-11-16.
 */
public class WebDriver2Test extends BaseOpenWebDriver {
    /**
     * please run this test to make sure environment has been setup correctly
     */
    @Test
    public void webDriverTestDemo2() {
        driver.get("https://www.youtube.com/");
        Assert.assertEquals("YouTube", "YouTube", driver.getTitle());
    }
}

package com.orangehrm.poc.core.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * It is in charged to instantiate a Chrome web driver.
 */
public class ChromeBrowser implements Browser {

    /**
     * Initializes an instance of {@link ChromeBrowser}.
     */
    public ChromeBrowser() {
        // Default constructor.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
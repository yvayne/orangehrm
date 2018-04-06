package com.orangehrm.poc.core.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by YVAYNER-DV01 on 4/6/2018.
 */
public class FirefoxBrowser implements Browser {

    /**
     * Initializes and instance of {@link FirefoxBrowser}.
     */
    public FirefoxBrowser() {
        // Default constructor.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebDriver getDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}

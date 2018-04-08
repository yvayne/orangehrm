package com.orangehrm.poc.runner;

import com.orangehrm.poc.core.config.ConfigFileReader;
import com.orangehrm.poc.core.webdriver.DriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Objects;

/**
 * It is in charge to set properties for the test execution.
 */
@CucumberOptions(
        format = {"pretty"},
        features = {"src/test/resources/features/"},
        glue = {"com.orangehrm.poc"})
public class Runner extends AbstractTestNGCucumberTests {

    private static final Logger LOGGER = LogManager.getLogger(Runner.class.getSimpleName());

    /**
     * Initializes the Web Driver.
     */
    @BeforeTest
    public void beforeAllTests() {
        DriverManager.getInstance().initializeDriver();
        DriverManager.getInstance().getWebDriver().navigate().to(ConfigFileReader.getInstance().getBaseUrl());
    }

    /**
     * Quits the Web Driver.
     */
    @AfterTest
    public void afterAllTests() {
        if (!Objects.isNull(DriverManager.getInstance().getWebDriver())) {
            DriverManager.getInstance().quitDriver();
        }
    }
}
package com.orangehrm.poc.core.webdriver;

import com.orangehrm.poc.core.config.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Created by YVAYNER-DV01 on 4/6/2018.
 */
public final class DriverManager {

    private static final String BROWSER = "uiBrowser";
    private static final String ENV_IMPLICIT_TIME_WAIT = "uiImplicitTimeWait";
    private static final String ENV_EXPLICIT_TIME_WAIT = "uiExplicitTimeWait";
    private static final String ENV_SLEEP_TIME_WAIT = "uiExplicitTimeWait";
    private static DriverManager instance;

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    /**
     * Initializes an instance of {@link DriverManager}.
     */
    private DriverManager() {
        // Default constructor.
    }

    /**
     * Initializes the Singleton Driver Manager instance.
     *
     * @return singleton instance.
     */
    public static DriverManager getInstance() {
        if (Objects.isNull(instance)) {
            instance = new DriverManager();
        }
        return instance;
    }

    /**
     * Initializes the Web Driver instance.
     */
    public void initializeDriver() {
        DriverTypes driverType = DriverTypes.valueOf(ConfigFileReader.getInstance().getEnv(BROWSER));
        this.webDriver = DriverFactory.getDriver(driverType);
        this.webDriver.manage().window().maximize();
        int implicitTimeWait = Integer.parseInt(ConfigFileReader.getInstance().getEnv(ENV_IMPLICIT_TIME_WAIT));
        int explicitTimeWait = Integer.parseInt(ConfigFileReader.getInstance().getEnv(ENV_EXPLICIT_TIME_WAIT));
        int sleepTimeWait = Integer.parseInt(ConfigFileReader.getInstance().getEnv(ENV_SLEEP_TIME_WAIT));
        setTimeWait(implicitTimeWait, explicitTimeWait, sleepTimeWait);
    }

    /**
     * Quits the Web Driver instance.
     */
    public void quitDriver() {
        this.webDriver.quit();
        this.webDriver = null;
    }

    /**
     * Gets the Web Driver instance.
     *
     * @return Web Driver instance.
     */
    public WebDriver getWebDriver() {
        return this.webDriver;
    }

    /**
     * Gets the Web Driver Wait instance.
     *
     * @return Web Driver Wait instance.
     */
    public WebDriverWait getWebDriverWait() {
        return this.webDriverWait;
    }

    /**
     * Sets implicit and explicit time wait.
     *
     * @param implicitTime implicit time wait value in seconds.
     * @param explicitTime explicit time wait value in seconds.
     * @param sleepTime    sleep time wait value in seconds.
     */
    public void setTimeWait(final int implicitTime, final int explicitTime, final int sleepTime) {
        setImplicitTimeWait(implicitTime);
        setExplicitTimeWait(explicitTime, sleepTime);
    }

    /**
     * Sets implicit time wait.
     *
     * @param implicitTimeWait implicit time wait in seconds.
     */
    private void setImplicitTimeWait(final int implicitTimeWait) {
        this.webDriver.manage().timeouts().implicitlyWait(implicitTimeWait, TimeUnit.SECONDS);
    }

    /**
     * Sets explicit time wait.
     *
     * @param explicitTimeWait explicit time wait in seconds.
     * @param sleepTimeWait    sleep time wait in seconds.
     */
    private void setExplicitTimeWait(final int explicitTimeWait, final int sleepTimeWait) {
        this.webDriverWait = new WebDriverWait(webDriver, explicitTimeWait, sleepTimeWait);
    }
}

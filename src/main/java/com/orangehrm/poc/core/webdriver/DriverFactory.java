package com.orangehrm.poc.core.webdriver;

import org.openqa.selenium.WebDriver;

import java.util.EnumMap;

/**
 * It is in charged to create the instance of a Web Driver.
 */
public final class DriverFactory {

    /**
     * Private constructor for {@link DriverFactory} utility class.
     */
    private DriverFactory() {
        //Default constructor.
    }

    /**
     * Gets a Web Driver instances based in a Driver Type parameter.
     *
     * @param type Driver Type enum value.
     * @return Web Driver instance.
     */
    public static WebDriver getDriver(final DriverTypes type) {
        EnumMap<DriverTypes, Browser> driverMap = new EnumMap<>(DriverTypes.class);
        driverMap.put(DriverTypes.CHROME, new ChromeBrowser());
        driverMap.put(DriverTypes.FIREFOX, new FirefoxBrowser());
        return driverMap.get(type).getDriver();
    }
}

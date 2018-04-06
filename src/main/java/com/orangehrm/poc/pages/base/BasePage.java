package com.orangehrm.poc.pages.base;

/**
 * Created by YVAYNER-DV01 on 4/6/2018.
 */

import com.orangehrm.poc.core.webdriver.DriverManager;
import org.openqa.selenium.support.PageFactory;




/**
 * Abstract class to represent and encapsulate common pages objects attributes.
 */
public abstract class BasePage {

    /**
     * Initializes an instance of {@link BasePage}.
     */
    public BasePage() {
        PageFactory.initElements(DriverManager.getInstance().getWebDriver(), this);
    }

    /**
     * Waits until the page is fully loaded.
     */
    public abstract void waitForLoad();
}

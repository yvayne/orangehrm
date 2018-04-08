package com.orangehrm.poc.core;

import com.orangehrm.poc.core.config.ConfigFileReader;
import com.orangehrm.poc.core.webdriver.DriverManager;
import com.orangehrm.poc.core.webdriver.DriverTypes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * It is in charged to manage the common Web Elements actions.
 */
public class CommonActions {

    private static final Logger LOGGER = LogManager.getLogger(CommonActions.class.getSimpleName());

    /**
     * Private constructor for {@link CommonActions} utility class.
     */
    private CommonActions() {
        // Default constructor.
    }

    /**
     * Waits and clears the WebElement.
     *
     * @param webElement WebElement to wait and clear.
     */
    public static void clearTextField(final WebElement webElement) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
    }

    /**
     * Clears and sets a Input Field.
     *
     * @param webElement WebElement to wait and fill.
     * @param text       Text to fill.
     */
    public static void clearAndSetInputField(final WebElement webElement, final String text) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        clearTextField(webElement);
        webElement.sendKeys(text);
    }

    /**
     * Sets a Input Field.
     *
     * @param webElement WebElement to wait and fill.
     * @param text       Text to fill.
     */
    public static void setInputField(final WebElement webElement, final String text) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.sendKeys(text);
    }

    /**
     * Waits and clicks on a webElement.
     *
     * @param webElement WebElement to wait and click.
     */
    public static void clickElement(final WebElement webElement) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    /**
     * Waits and gets the text of an WebElement.
     *
     * @param webElement WebElement to wait and get the text.
     * @return Text of element.
     */
    public static String getTextElement(final WebElement webElement) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    /**
     * Verifies if Web element is Displayed.
     *
     * @param webElement WebElement.
     * @return True if the element is Displayed.
     */
    public static boolean isDisplayed(final WebElement webElement) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.isDisplayed();
    }


    /**
     * Verifies if the current browser belongs to the driver type received.
     *
     * @param driver Driver Type enum value.
     * @return True if current browser belongs to driver type parameter.
     */
    public static boolean isCurrentBrowser(final DriverTypes driver) {
        return ConfigFileReader.getInstance().getBrowser().contains(driver.name());
    }

    /**
     * Gets the value from a web element.
     * @param webElement the webElement.
     * @param value the attribute value.
     * @return the value obtained from a web Element.
     */
    public static String getValueFromElement(final WebElement webElement, final String value) {
        return webElement.getAttribute(value);
    }
}

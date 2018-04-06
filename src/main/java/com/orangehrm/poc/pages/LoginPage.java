package com.orangehrm.poc.pages;

import com.orangehrm.poc.core.CommonActions;
import com.orangehrm.poc.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * It is in charge to represent the login page.
 */
public class LoginPage extends BasePage {

    @FindBy(id = "firstName")
    private WebElement firstNameTextField;

    @FindBy(id = "middleName")
    private WebElement middleNameTextField;

    @FindBy(id = "lastName")
    private WebElement lastNameTextField;

    @FindBy(id = "btnSave")
    private WebElement saveButton;

    /**
     * Initializes and instance of {@link LoginPage}.
     */
    public LoginPage() {
        waitForLoad();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void waitForLoad() {
        CommonActions.isDisplayed(firstNameTextField);
    }

    /**
     * Sets the first name text field.
     * @param firstNameValue
     */
    public void setFirstName(final String firstNameValue) {
        CommonActions.clearAndSetInputField(firstNameTextField, firstNameValue);
    }

    /**
     * Sets the middle name text field.
     * @param middleNameValue
     */
    public void setMiddleName(final String middleNameValue) {
        CommonActions.clearAndSetInputField(middleNameTextField, middleNameValue);
    }

    public DashboardPage pressSaveButton() {
        CommonActions.clickElement(saveButton);
        return new DashboardPage();
    }
}

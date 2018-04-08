package com.orangehrm.poc.pages;

import com.orangehrm.poc.core.CommonActions;
import com.orangehrm.poc.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * It is in charge to represent the login page.
 */
public class LoginPage extends BasePage {

    @FindBy(css = "input#txtUsername")
    private WebElement userNameTextField;

    @FindBy(css = "input#txtPassword")
    private WebElement passwordTextField;

    @FindBy(css = "input#btnLogin")
    private WebElement loginButton;

    /**
     * Initializes and instance of {@link LoginPage}.
     */
    public LoginPage() {
    }

    /**
     * Sets the first name text field.
     * @param usernameValue
     */
    public void setUserNameTextField(final String usernameValue) {
        CommonActions.clearAndSetInputField(userNameTextField, usernameValue);
    }

    /**
     * Sets the middle name text field.
     * @param password
     */
    public void setPasswordTextField(final String password) {
        CommonActions.clearAndSetInputField(passwordTextField, password);
    }

    public DashboardPage pressLoginButton() {
        CommonActions.clickElement(loginButton);
        return new DashboardPage();
    }
}

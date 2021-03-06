package com.orangehrm.poc.pages;

import com.orangehrm.poc.core.CommonActions;
import com.orangehrm.poc.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * It is in charge to represent the Add employee page.
 */
public class AddEmployeePage extends BasePage {

    public static final String VALUE = "value";

    private NavigationBar navigationBar;

    @FindBy(id = "firstName")
    private WebElement firstNameTextField;

    @FindBy(id = "middleName")
    private WebElement middleNameTextField;

    @FindBy(id = "lastName")
    private WebElement lastNameTextField;

    @FindBy(id = "employeeId")
    private WebElement employeeIdTextField;

    @FindBy(id = "btnSave")
    private WebElement saveButton;

    public AddEmployeePage() {
        navigationBar = new NavigationBar();
    }

    public void setFirstNameTextField(final String firstName) {
        CommonActions.setInputField(firstNameTextField, firstName);
    }

    public void setMiddleNameTextField(final String middleName) {
        CommonActions.setInputField(middleNameTextField, middleName);
    }

    public void setLastNameTextField(final String lastName) {
        CommonActions.setInputField(lastNameTextField, lastName);
    }

    public String getEmployeeId() {
        return CommonActions.getValueFromElement(employeeIdTextField, VALUE);
    }

    public PersonalDetailsPage clickSaveButton() {
        CommonActions.clickElement(saveButton);
        return new PersonalDetailsPage();
    }
}

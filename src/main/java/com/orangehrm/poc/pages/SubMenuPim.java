package com.orangehrm.poc.pages;

import com.orangehrm.poc.core.CommonActions;
import com.orangehrm.poc.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by YVAYNER-DV01 on 4/7/2018.
 */
public class SubMenuPim extends BasePage {
    @FindBy(id="menu_pim_viewEmployeeList")
    private WebElement employeeListButton;

    @FindBy (id="menu_pim_addEmployee")
    private WebElement addEmployeeButton;

    public SubMenuPim(){
        waitForLoad();
    }

    @Override
    public void waitForLoad() {
        //CommonActions.isDisplayed(employeeListButton);
    }

    public EmployeeListPage clickEmployeeListButton() {
        CommonActions.clickElement(employeeListButton);
        return new EmployeeListPage();
    }

    public AddEmployeePage clickAddEmployeeButton() {
        CommonActions.clickElement(addEmployeeButton);
        return new AddEmployeePage();
    }
}

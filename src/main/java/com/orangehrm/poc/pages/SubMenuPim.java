package com.orangehrm.poc.pages;

import com.orangehrm.poc.core.CommonActions;
import com.orangehrm.poc.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * It is in charge to represent the submenu component.
 */
public class SubMenuPim extends BasePage {
    @FindBy(id="menu_pim_viewEmployeeList")
    private WebElement employeeListButton;

    @FindBy (id="menu_pim_addEmployee")
    private WebElement addEmployeeButton;

    public SubMenuPim(){
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

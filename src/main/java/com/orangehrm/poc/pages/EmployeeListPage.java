package com.orangehrm.poc.pages;

import com.orangehrm.poc.core.CommonActions;
import com.orangehrm.poc.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by YVAYNER-DV01 on 4/7/2018.
 */
public class EmployeeListPage extends BasePage {

    private static final String[]  ColumnsName = {"Id","First&MiddleName","LastName","JobTitle","Employee","SubUnit","Supervisor"};

    @FindBy(css="a.toggle")
    private WebElement informationLabel;

    @FindBy(css="input[id='empsearch_employee_name_empName']")
    private WebElement employeeNameTextField;

    @FindBy(css="input[id='empsearch_id']")
    private WebElement employeeIdTextField;

    @FindBy(css="input[id='searchBtn']")
    private WebElement searchButton;

    @FindBy(css= "tr.odd")
    private WebElement resultTable;

    private NavigationBar navBar;
    private SubMenuPim menuPim;

    public EmployeeListPage() {
        navBar = new NavigationBar();
        menuPim = new SubMenuPim();
        waitForLoad();
    }

    @Override
    public void waitForLoad() {
        //CommonActions.isDisplayed(informationLabel);
    }

    public void setEmployeeNameTextField(final String fullName) {
        CommonActions.setInputField(employeeIdTextField, fullName);
    }

    public void setEmployeeIdTextField(final String employeeId) {
        CommonActions.setInputField(employeeIdTextField, employeeId);
    }

    public EmployeeListPage clickSearchButton() {
        CommonActions.clickElement(searchButton);
        return new EmployeeListPage();
    }

    public Map<String,String> getEmployeeResult() {
        Map<String,String> employeeResult = new HashMap<>();
        List<WebElement> columns = resultTable.findElements(By.tagName("td"));
        for(int i=0;i<ColumnsName.length;i++) {
            employeeResult.put(ColumnsName[i], columns.get(i+1).getText());
            System.out.println(columns.get(i+1).getText());
        }
        return employeeResult;
    }

    public SubMenuPim getSubMenuPim() {
        return menuPim;
    }

    public NavigationBar getNavigationBar() {
        return navBar;
    }
}

package com.orangehrm.poc.stepdefinitions;

import com.orangehrm.poc.pages.AddEmployeePage;
import com.orangehrm.poc.pages.EmployeeListPage;
import com.orangehrm.poc.utils.entities.EmployeeEntity;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.util.Map;

/**
 * Created by YVAYNER-DV01 on 4/7/2018.
 */
public class EmployeeListStepDefs {
    private EmployeeListPage employeeListPage;
    private AddEmployeePage addEmployeePage;
    private EmployeeEntity employeeEntity;
    public EmployeeListStepDefs(EmployeeListPage employeeListPage, AddEmployeePage addEmployeePage, EmployeeEntity employeeEntity) {
        this.employeeListPage = employeeListPage;
        this.addEmployeePage = addEmployeePage;
        this.employeeEntity = employeeEntity;
    }
    @And("^I click on Add Employee tab$")
    public void iClickOnAddEmployeeTab() {
        addEmployeePage = employeeListPage.getSubMenuPim().clickAddEmployeeButton();
    }

    @And("^I fill the full employee name on Employee Name text field$")
    public void iFillTheFullEmployeeNameOnEmployeeNameTextField() {
        employeeListPage.setEmployeeNameTextField(employeeEntity.getFullName());
    }

    @And("^I click on Search Button$")
    public void iClickOnSearchButton() {
        employeeListPage.clickSearchButton();
    }

    @Then("^the employee created should be displayed on employee table$")
    public void theEmployeeCreatedShouldBeDisplayedOnEmployeeTable() {
        //{"Id","First&MiddleName","LastName","JobTitle","Employee","SubUnit","Supervisor"}
        Map<String,String> actualResult = employeeListPage.getEmployeeResult();
        Assert.assertEquals(actualResult.get("Id"),employeeEntity.getEmployeeId());
        Assert.assertEquals(actualResult.get("First&MiddleName"),String.format("%s %s",
                employeeEntity.getFirstName(),employeeEntity.getMiddleName()));
        Assert.assertEquals(actualResult.get("LastName"),employeeEntity.getLastName());
    }
}

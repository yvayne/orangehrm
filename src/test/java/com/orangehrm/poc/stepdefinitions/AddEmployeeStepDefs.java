package com.orangehrm.poc.stepdefinitions;

import com.orangehrm.poc.pages.AddEmployeePage;
import com.orangehrm.poc.pages.PersonalDetailsPage;
import com.orangehrm.poc.utils.entities.EmployeeEntity;
import cucumber.api.java.en.And;

import java.util.Map;

/**
 * this class represents the step definitions for add employee page.
 */
public class AddEmployeeStepDefs {
    private AddEmployeePage addEmployeePage;
    private PersonalDetailsPage personalDetailsPage;
    private EmployeeEntity employeeEntity;

    public AddEmployeeStepDefs(AddEmployeePage addEmployeePage, PersonalDetailsPage personalDetailsPage,
                               EmployeeEntity employeeEntity) {
        this.addEmployeePage = addEmployeePage;
        this.personalDetailsPage = personalDetailsPage;
        this.employeeEntity = employeeEntity;
    }

    @And("^I fill the employee from with the following data:$")
    public void iFillTheEmployeeFromWithTheFollowingData(Map<String, String> employeeMap) {
        addEmployeePage.setFirstNameTextField(employeeMap.get("FirstName"));
        addEmployeePage.setMiddleNameTextField(employeeMap.get("MiddleName"));
        addEmployeePage.setLastNameTextField(employeeMap.get("LastName"));

        employeeEntity.setFirstName(employeeMap.get("FirstName"));
        employeeEntity.setMiddleName(employeeMap.get("MiddleName"));
        employeeEntity.setLastName(employeeMap.get("LastName"));
        employeeEntity.setEmployeeId(addEmployeePage.getEmployeeId());

    }

    @And("^I click on Save Button$")
    public void iClickOnSaveButton() {
        personalDetailsPage = addEmployeePage.clickSaveButton();
    }
}

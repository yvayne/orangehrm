package com.orangehrm.poc.stepdefinitions;

import com.orangehrm.poc.pages.AddEmployeePage;
import com.orangehrm.poc.pages.EmployeeListPage;
import com.orangehrm.poc.pages.PersonalDetailsPage;
import com.orangehrm.poc.utils.entities.EmployeeEntity;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

/**
 * Created by YVAYNER-DV01 on 4/7/2018.
 */
public class PersonalDetailsStepDefs {
    private EmployeeListPage employeeListPage;
    private PersonalDetailsPage personalDetailsPage;
    private EmployeeEntity employeeEntity;
    public PersonalDetailsStepDefs(EmployeeListPage employeeListPage, PersonalDetailsPage personalDetailsPage, EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
        this.employeeListPage = employeeListPage;
        this.personalDetailsPage = personalDetailsPage;
    }
    @And("^I click on Employee List tab$")
    public void iClickOnEmployeeListTab() {
        employeeListPage = personalDetailsPage.clickEmployeeListButton();
    }
}

package com.orangehrm.poc.stepdefinitions;

import com.orangehrm.poc.pages.DashboardPage;
import com.orangehrm.poc.pages.EmployeeListPage;
import cucumber.api.java.en.When;

/**
 * This class represents the step definitions for  dashboard page.
 */
public class DashboardStepDefs {
    private DashboardPage dashboardPage;
    private EmployeeListPage employeeListPage;
    public DashboardStepDefs(DashboardPage dashboardPage, EmployeeListPage employeeListPage) {
        this.dashboardPage = dashboardPage;
        this.employeeListPage = employeeListPage;
    }
    @When("^I click on PIM tab$")
    public void iClickOnPIMTab() {
        employeeListPage = dashboardPage.clickPimTab();
    }
}

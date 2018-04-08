package com.orangehrm.poc.stepdefinitions;

import com.orangehrm.poc.core.config.ConfigFileReader;
import com.orangehrm.poc.pages.DashboardPage;
import com.orangehrm.poc.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

/**
 * Created by YVAYNER-DV01 on 4/7/2018.
 */
public class LoginStepDefs {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    public LoginStepDefs(DashboardPage dashboardPage,LoginPage loginPage){
        this.loginPage = loginPage;
        this.dashboardPage = dashboardPage;
    }
    @Given("^I login as Admin user on orangehrm index page$")
    public void iLoginAsAdminUserOnOrangehrmIndexPage() {
        loginPage.setUserNameTextField(ConfigFileReader.getInstance().getUsername());
        loginPage.setPasswordTextField(ConfigFileReader.getInstance().getPassword());
        dashboardPage = loginPage.pressLoginButton();
    }
}

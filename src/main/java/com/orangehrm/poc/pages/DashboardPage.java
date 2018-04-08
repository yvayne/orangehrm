package com.orangehrm.poc.pages;

import com.orangehrm.poc.core.CommonActions;
import com.orangehrm.poc.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * It is in charge to represent the Dashboard page.
 */
public class DashboardPage extends BasePage{

    private NavigationBar navBar;

    @FindBy(css="div.head")
    private WebElement dashboardLabel;

    public DashboardPage() {
        navBar = new NavigationBar();
        waitForLoad();
    }

    @Override
    public void waitForLoad() {
        //CommonActions.isDisplayed(dashboardLabel);
    }

    public EmployeeListPage clickPimTab() {
        return navBar.clickPimTab();
    }

    public NavigationBar getNavigationBar() {
        return navBar;
    }
}

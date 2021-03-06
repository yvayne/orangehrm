package com.orangehrm.poc.pages;

import com.orangehrm.poc.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * It is in charge to represent the Dashboard page.
 */
public class DashboardPage extends BasePage{

    private NavigationBar navigationBar;

    @FindBy(css="div.head")
    private WebElement dashboardLabel;

    public DashboardPage() {
        navigationBar = new NavigationBar();
    }

    public EmployeeListPage clickPimTab() {
        return navigationBar.clickPimTab();
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }
}

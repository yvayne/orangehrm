package com.orangehrm.poc.pages;

import com.orangehrm.poc.core.CommonActions;
import com.orangehrm.poc.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by YVAYNER-DV01 on 4/6/2018.
 */
public class NavigationBar extends BasePage {

    @FindBy(id="menu_pim_viewPimModule")
    private WebElement pimTab;

    @FindBy(id="menu_leave_viewLeaveModule")
    private WebElement leaveTab;

    public NavigationBar() {
       waitForLoad();
    }

    @Override
    public void waitForLoad() {
        //CommonActions.isDisplayed(pimTab);
    }

    public EmployeeListPage clickPimTab() {
        CommonActions.clickElement(pimTab);
        return new EmployeeListPage();
    }
}

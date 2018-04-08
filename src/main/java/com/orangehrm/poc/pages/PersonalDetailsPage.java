package com.orangehrm.poc.pages;

import com.orangehrm.poc.core.CommonActions;
import com.orangehrm.poc.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by YVAYNER-DV01 on 4/7/2018.
 */
public class PersonalDetailsPage extends BasePage {
    @FindBy(id="profile-pic")
    private WebElement profilePictureBox;

    private NavigationBar navBar;
    private SubMenuPim subMenuPim;

    public PersonalDetailsPage() {
        navBar = new NavigationBar();
        subMenuPim = new SubMenuPim();
        waitForLoad();
    }

    @Override
    public void waitForLoad() {
        //CommonActions.isDisplayed(profilePictureBox);
    }

    public EmployeeListPage clickEmployeeListButton() {
        return subMenuPim.clickEmployeeListButton();
    }
}

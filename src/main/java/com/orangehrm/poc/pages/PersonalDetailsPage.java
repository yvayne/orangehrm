package com.orangehrm.poc.pages;

import com.orangehrm.poc.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * It is in charge to represent the personal details page.
 */
public class PersonalDetailsPage extends BasePage {
    @FindBy(id="profile-pic")
    private WebElement profilePictureBox;

    private NavigationBar navigationBar;
    private SubMenuPim subMenuPim;

    public PersonalDetailsPage() {
        navigationBar = new NavigationBar();
        subMenuPim = new SubMenuPim();
    }

    public EmployeeListPage clickEmployeeListButton() {
        return subMenuPim.clickEmployeeListButton();
    }
}

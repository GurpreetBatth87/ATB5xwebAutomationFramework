package org.Automation5x.pages.pages.pageobjectModel;

import org.Automation5x.pages.base.CommonToAllPage;
import org.openqa.selenium.By;

public class DashboardPage_POM extends CommonToAllPage {

    public DashboardPage_POM() {

    }

    //page locator
    By usernameondashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");

    //page action
    public String LoggedInUserName() {
        presenceOfElement(usernameondashboard);
        return getElement(usernameondashboard).getText();

    }




}

package org.Automation5x.pages.pages.pageobjectModel;

import org.Automation5x.pages.base.CommonToAllPage;
import org.Automation5x.pages.utils.properetyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage_PON extends CommonToAllPage {
    WebDriver driver;

    public LoginPage_PON() {
        super();
    }

    //Page Locator
    By username = By.id("login-username");
    By password = By.id("login-password");
    By loginButton = By.id("js-login-btn");
    By errormsg = By.id("js-notification-box-msg");

    // Page action
    public String LoginToVwoNavogate() throws InterruptedException {

        enterInput(username, properetyReader.readkey("username"));
        enterInput(password,"Admin");
        clickElement(loginButton);
        presenceOfElement(errormsg);
        visibleOfElement(errormsg);

        Thread.sleep(10000);
        return getElement(errormsg).getText();

}

    public String LoginToVwowithvalidcred() throws InterruptedException {

        enterInput(username, properetyReader.readkey("username"));
        enterInput(password,properetyReader.readkey("password"));
        clickElement(loginButton);


        Thread.sleep(10000);
        return getElement(errormsg).getText();
}
    public DashboardPage_POM afterLoginVWOValidCreds(){
        return new DashboardPage_POM();
    }
}


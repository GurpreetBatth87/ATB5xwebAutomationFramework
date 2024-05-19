package org.Automation5x.pages.pages.pageFactory;

import org.Automation5x.pages.base.CommonToAllPage;
import org.Automation5x.pages.pages.pageobjectModel.DashboardPage_POM;
import org.Automation5x.pages.utils.properetyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF extends CommonToAllPage {
    WebDriver driver;

    public LoginPage_PF(WebDriver driver) {
        super();
        PageFactory.initElements(driver,this);
    }

    //Page Locator
    //By username = By.id("login-username");
    @FindBy(id = "login-username")
    private WebElement username;

    @FindBy(id = "login-password")
    private WebElement password;

    @FindBy(id = "js-login-btn")
    private WebElement loginButton;

    @FindBy(id = "js-notification-box-msg")
    private WebElement errormsg;


    // Page action
    public  void LoginToVwoNavogate() throws InterruptedException {

        enterInput(username, properetyReader.readkey("username"));
        enterInput(password, "Admin");
        clickElement(loginButton);
//        presenceOfElement(errormsg);
//        visibleOfElement(errormsg);

        Thread.sleep(10000);
//        return getElement(errormsg).getText();
    }



    public void LoginToVwowithvalidcred() throws InterruptedException {

        enterInput(username, properetyReader.readkey("username"));
        enterInput(password, properetyReader.readkey("password"));
        clickElement(loginButton);


        Thread.sleep(10000);
    }
        // return getElement(errormsg).getText();


    public DashboardPage_POM afterLoginVWOValidCreds(){
        return new DashboardPage_POM();
    }
}


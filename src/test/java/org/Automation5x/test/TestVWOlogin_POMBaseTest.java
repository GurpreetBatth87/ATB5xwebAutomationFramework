package org.Automation5x.test;

import org.Automation5x.pages.base.CommonToAllPage;
import org.Automation5x.pages.pages.pageobjectModel.DashboardPage_POM;
import org.Automation5x.pages.pages.pageobjectModel.LoginPage_PON;
import org.Automation5x.pages.utils.properetyReader;
import org.Automation5x.pagesbasetest.CommonToAllTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOlogin_POMBaseTest extends CommonToAllTest {

    @Test(groups = {"smoke"},priority = 1)
    public void testLoginPage() throws InterruptedException {
        LoginPage_PON loginPagePon = new LoginPage_PON();
        //loginPagePon.LoginToVwoNavogate();
        loginPagePon.OpenVWOLoginURL();
        String error_msg_attribute= loginPagePon.LoginToVwoNavogate();
        Assert.assertEquals(error_msg_attribute , "Your email, password, IP address or location did not match");


    }
    @Test(groups = {"smoke"},priority = 2)
    public void testLoginPage_Postive() throws InterruptedException {
        LoginPage_PON loginPagePon = new LoginPage_PON();
        //loginPagePon.LoginToVwoNavogate();
        loginPagePon.OpenVWOLoginURL();
        loginPagePon.LoginToVwowithvalidcred();
        DashboardPage_POM dashboardPagePom = loginPagePon.afterLoginVWOValidCreds();
        String Expecteduser = dashboardPagePom.LoggedInUserName();
        Assert.assertEquals(Expecteduser , properetyReader.readkey("expected_username"));


    }

}

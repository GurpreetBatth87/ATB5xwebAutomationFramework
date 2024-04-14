package org.Automation5x.pagesbasetest;

import org.Automation5x.pages.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {
    @BeforeMethod
    protected void setup(){
        DriverManager.start();
    }

    @AfterMethod
    protected void setdown(){
        DriverManager.down();
    }


}

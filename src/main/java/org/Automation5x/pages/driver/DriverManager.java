package org.Automation5x.pages.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class DriverManager {
   public static WebDriver driver;

    public static void start(){
        if(driver == null){
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--start-maximized");
            edgeOptions.addArguments("--guest");
            driver = new EdgeDriver();
        }
    }



    public static void down(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }


}

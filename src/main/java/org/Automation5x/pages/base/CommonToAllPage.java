package org.Automation5x.pages.base;

import com.google.j2objc.annotations.Property;
import org.Automation5x.pages.driver.DriverManager;
import org.Automation5x.pages.utils.properetyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class CommonToAllPage {
    public CommonToAllPage() {
        // If you want to call something before every Page Object Class call, Put your Code here");
        // Open File, Open Data Base Connection You can write code here

    }
    public void OpenVWOLoginURL(){

        DriverManager.driver.get(properetyReader.readkey("url"));
    }

    public void clickElement(By by) {
        DriverManager.driver.findElement(by).click();

    }

    public void enterInput(By by, String key) {
        DriverManager.driver.findElement(by).sendKeys(key);

    }

    // Wait Explicits here

    public WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait(DriverManager.driver, Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibleOfElement(By elementLocation) {
        return new WebDriverWait(DriverManager.driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }
    public WebElement getElement(By key) {
        return (DriverManager.driver.findElement(key));
    }



}

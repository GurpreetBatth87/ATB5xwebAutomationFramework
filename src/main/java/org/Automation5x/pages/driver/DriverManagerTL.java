package org.Automation5x.pages.driver;

import jdk.internal.access.JavaIOFileDescriptorAccess;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Objects;


public class DriverManagerTL {

    public static final ThreadLocal<WebDriver> dr = new ThreadLocal<>();
    public static WebDriver driver;

    public static void setdriver(WebDriver driverRef) {
        dr.set(driverRef);
    }
    public static WebDriver getDriver(){
        return dr.get();
    }


    //unload driver
    public static void unload(){
        dr.remove();
    }
    public static void init(){
        if (Objects.isNull(DriverManagerTL.getDriver())) {

            WebDriver driver = new EdgeDriver();
            setdriver(driver);
        }

    }

    public static void down(){
        if (Objects.nonNull(DriverManagerTL.getDriver())){
            getDriver().quit();
        }

    }






}

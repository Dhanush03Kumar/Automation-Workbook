package com.workbook.base;

import com.workbook.Utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

    protected static WebDriver driver ;

    //Setup method
    public static void setup(){

        if(driver!=null){
            return;
        }

        String browser = ConfigReader.getProperty("browser").toLowerCase();


        switch (browser){
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                options.addArguments("--disable-notification");
                driver = new ChromeDriver(options);
                break;
            case "firefox":
                break;

            case "edge":
                break;

            default:
                throw new IllegalArgumentException("Invalid browser value: "+browser);


        }

        String url = ConfigReader.getProperty("url");
        driver.get(url);

    }

    //TearDown method
    public static void teardown(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }
}

package com.workbook.base;

import com.workbook.Utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Base {

    protected static WebDriver driver ;
    protected static String downloadDir;

    //Setup method
    public static void setup(){

        if(driver!=null){
            return;
        }

        String browser = ConfigReader.getProperty("browser").toLowerCase();
        downloadDir = ConfigReader.getProperty("dir").toLowerCase();

        switch (browser){
            case "chrome":
                // Set Chrome preferences for downloads
                Map<String, Object> prefs = new HashMap<>();
                prefs.put("download.default_directory", downloadDir);
                prefs.put("download.prompt_for_download", false);
                prefs.put("plugins.always_open_pdf_externally", true);

                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("prefs",prefs);
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

    public static String getDownloadDir(){
        return downloadDir;
    }
}

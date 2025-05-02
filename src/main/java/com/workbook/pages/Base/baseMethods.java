package com.workbook.pages.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class baseMethods {
    protected WebDriver driver;
    protected WebDriverWait wait;
    JavascriptExecutor js;

    public baseMethods(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver,this);
    }

    public void clickElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void enterText(WebElement element,String text) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
        Thread.sleep(5000);
    }


    public String getText(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();

    }

    public void scrollAndSearchDropDown(WebElement element, String text) throws InterruptedException {




            List<WebElement> cities = element.findElements(By.xpath("//ul[@role='listbox']//li"));


            for(WebElement city:cities){
                System.out.println(city.getText());
                if(city.getText().contains(text)){
                    js.executeScript("arguments[0].scrollIntoView(true)",city);
                    city.click();
                    return;
                }
            }
            throw new RuntimeException("Not found");


    }

    public void scrollToView(WebElement element){

        js.executeScript("arguments[0].scrollIntoView(true)",element);


    }

    public String getAttribute(WebElement element){
        return element.getDomAttribute("href");
    }

    public String getFileName(String url){
        if (url == null || !url.contains("/")) {
            throw new IllegalArgumentException("Invalid URL or format: " + url);
        }
        return url.substring(url.lastIndexOf('/') + 1);
    }

    public void placeholder(){
        System.out.println("Place holder");
    }



}

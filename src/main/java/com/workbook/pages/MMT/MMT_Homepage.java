package com.workbook.pages.MMT;

import com.workbook.pages.Base.baseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MMT_Homepage extends baseMethods {

    @FindBy(xpath = "//span[@class='commonModal__close']")
    private WebElement ClosePopUp;

    @FindBy(xpath = "//input[@id='fromCity']")
    private WebElement Arrival;

    @FindBy(xpath = "//input[@placeholder='From']")
    private WebElement ArrivalDynamic;

    @FindBy(xpath = "//input[@id='toCity']")
    private WebElement Destination;

    @FindBy(xpath = "//input[@placeholder='To']")
    private WebElement DestinationDynamic;

    @FindBy(xpath = "//div[@role='listbox']")
    private WebElement Suggestions;

    @FindBy(xpath = "//div[@aria-label='Mon May 12 2025']")
    private WebElement date;

    @FindBy(xpath = "//a[text()='Search']")
    private WebElement SearchButtton;


    public MMT_Homepage(WebDriver driver) {
        super(driver);
    }

    public void selectFromCity(String fromCity) throws InterruptedException {
        clickElement(Arrival);
        enterText(ArrivalDynamic,fromCity);


    }

    public void selectToCity(String fromCity) throws InterruptedException {
        clickElement(Destination);
        enterText(DestinationDynamic,fromCity);


    }

    public void selectCityDynamic(String text) throws InterruptedException {
        scrollAndSearchDropDown(Suggestions,text);
    }


    public void closePopup() {
        clickElement(ClosePopUp);
    }

    public void search() throws InterruptedException {
        clickElement(date);
        Thread.sleep(2500);
        clickElement(SearchButtton);
        Thread.sleep(2000);
    }
}

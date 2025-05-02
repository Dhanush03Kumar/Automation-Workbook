package com.workbook.pages.IOC;


import com.workbook.Utils.AssertionHelper;
import com.workbook.Utils.PDFHelper;
import com.workbook.base.Base;
import com.workbook.pages.Base.baseMethods;
import com.workbook.pages.MMT.MMT_Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IOC_Homepage extends baseMethods {

    @FindBy(xpath = "//div[@data-cy='hamburger']")
    private WebElement optionsIcon;

    @FindBy(xpath = "//button[contains(text(),'Yes')]")
    private WebElement acceptCookies;

    @FindBy(xpath = "//span[text()='Documents']")
    private WebElement documents;

    @FindBy(xpath = "//a[text()='Olympic Games']")
    private  WebElement olymicGames;

    @FindBy(xpath = "//span[text()='Factsheets']")
    private WebElement Factsheets;

    @FindBy(xpath = "//a[@href='https://stillmed.olympics.com/media/Documents/Olympic-Games/Factsheets/Records-of-medals-at-the-Games-of-the-Olympiad.pdf']")
    private WebElement Records;

    public IOC_Homepage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies(){
        clickElement(acceptCookies);
    }

    public void openMenu(){
        clickElement(optionsIcon);
    }


    public void getDocuments() {
        scrollToView(documents);
        clickElement(documents);
    }

    public void clickOlympicGames(){
        scrollToView(olymicGames);
        clickElement(olymicGames);
    }

    public void clickFactSheet(){
        clickElement(Factsheets);
    }

    public void viewRecords(){
        clickElement(Records);

    }

    public void PDFValidator(String expected,String message){
//        System.out.println(Base.getDownloadDir()+"\\"+getFileName(getAttribute(Records)));
        String Actual = PDFHelper.getPDFContent(Base.getDownloadDir()+"\\"+getFileName(getAttribute(Records)));
//        System.out.println("Extracted PDF Content: " + Actual);
        AssertionHelper.verifyTextContains(Actual,expected,message);
    }

}

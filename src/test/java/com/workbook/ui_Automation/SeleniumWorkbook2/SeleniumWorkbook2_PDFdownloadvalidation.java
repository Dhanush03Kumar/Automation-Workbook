package com.workbook.ui_Automation.SeleniumWorkbook2;

import com.workbook.Utils.PDFHelper;
import com.workbook.pages.IOC.IOC_Homepage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.workbook.base.Base.getDriver;
import static com.workbook.base.Base.setup;

public class SeleniumWorkbook2_PDFdownloadvalidation {
    private WebDriver driver;
    private IOC_Homepage iocHomepage;

    @Before
    public void initialzeDriver(){
        setup();
        this.driver=getDriver();
        if(this.driver==null){
            throw new RuntimeException("WebDriver instance is null");
        }

        iocHomepage=new IOC_Homepage(driver);
    }


    @Given("User is on IOC homepage and clicks on menu")
    public void userIsOnIOCHomepageAndClicksOnMenu() {
        iocHomepage.acceptCookies();
        iocHomepage.openMenu();
    }

    @When("User clicks on Documents menu")
    public void userClicksOnDocumentsMenu() {

        iocHomepage.getDocuments();
    }

    @And("User navigates to olympics games menu")
    public void userNavigatesToOlympicsGamesMenu() {
        iocHomepage.clickOlympicGames();
    }

    @And("User navigates to factsheet menu")
    public void userNavigatesToFactsheetMenu() {
        iocHomepage.clickFactSheet();
    }

    @And("User views Records of medals at the Games of the Olympiad")
    public void userViewsRecordsOfMedalsAtTheGamesOfTheOlympiad() {
        iocHomepage.viewRecords();
    }

    @Then("User download and validates records")
    public void userDownloadAndValidatesRecords() {
        iocHomepage.PDFValidator("28 medals - PHELPS, Michael (USA), swimming, 2004-16","Couldnt find it ");
    }
}

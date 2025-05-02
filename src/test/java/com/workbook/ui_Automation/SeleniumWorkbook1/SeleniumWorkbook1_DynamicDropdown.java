package com.workbook.ui_Automation.SeleniumWorkbook1;

import com.workbook.base.Base;
import com.workbook.pages.MMT.MMT_Homepage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SeleniumWorkbook1_DynamicDropdown extends Base {
    private WebDriver driver;
    private MMT_Homepage mmtHomepage;

    @Before
    public void initializeDriver(){
        setup();
        this.driver=getDriver();
        if(this.driver==null){
            throw new RuntimeException("WebDriver instance is null");
        }

        mmtHomepage = new MMT_Homepage(driver);


    }
    @Given("User is on the MakeMyTrip homepage")
    public void userIsOnTheMakeMyTripHomepage() {
        mmtHomepage.closePopup();
    }

    @When("User enters {string} into the From city field")
    public void userEntersIntoTheFromCityField(String fromCity) throws InterruptedException {
        mmtHomepage.selectFromCity(fromCity);
    }

    @And("User selects {string} from dynamic From dropdown")
    public void userSelectsFromDynamicFromDropdown(String from) throws InterruptedException {
        mmtHomepage.selectCityDynamic(from);
    }


    @And("User enters {string} into the To city field")
    public void userEntersIntoTheToCityField(String toCity) throws InterruptedException {
        mmtHomepage.selectToCity(toCity);
    }

    @And("User selects {string} from dynamic To dropdown")
    public void userSelectsFromDynamicToDropdown(String to) throws InterruptedException {
        mmtHomepage.selectCityDynamic(to);
    }

    @And("User clicks on search button")
    public void userClicksOnSearchButton() throws InterruptedException {
        mmtHomepage.search();
    }

    @Then("User should see selected cities {string} and {string} on the result page")
    public void userShouldSeeSelectedCitiesAndOnTheResultPage(String arg0, String arg1) {
    }



}

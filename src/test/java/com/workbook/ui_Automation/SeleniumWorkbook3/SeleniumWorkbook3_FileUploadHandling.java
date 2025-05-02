package com.workbook.ui_Automation.SeleniumWorkbook3;

import com.workbook.Utils.ConfigReader;
import com.workbook.base.Base;
import com.workbook.pages.SmallPDF.smallPDF_Homepage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.workbook.base.Base.*;

public class SeleniumWorkbook3_FileUploadHandling {

    private WebDriver driver;
    private smallPDF_Homepage smallPDFHomepage;
    String filepath = null;



    @Before
    public void initialzeDriver(){
        setup();
        this.driver=getDriver();
        if(driver==null){
            throw new RuntimeException("Driver instance null");
        }

        smallPDFHomepage = new smallPDF_Homepage(driver);

        filepath = Base.getFileToBeUploaded();
        if (filepath==null){
            throw new RuntimeException("Filepath is null");
        }

    }

    @Given("User is on smallPDF compress pdf page")
    public void userIsOnSmallPDFCompressPdfPage() {
        smallPDFHomepage.pdfCompressTool();
    }

    @When("User uploads file to compress")
    public void userUploadsFileToCompress() throws InterruptedException {
        smallPDFHomepage.fileUpload(filepath);
    }


    @Then("User should be able to compress and download")
    public void userShouldBeAbleToCompressAndDownload() {
        smallPDFHomepage.compressAndDownload();

    }

//    @After
//    public void CloseDriver(){
//        teardown();
//    }


}

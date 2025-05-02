package com.workbook.pages.SmallPDF;

import com.workbook.Utils.AssertionHelper;
import com.workbook.pages.Base.baseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class smallPDF_Homepage extends baseMethods {

    @FindBy(xpath = "//a[text()='Compress']")
    private WebElement Compress;

    @FindBy(xpath = "//span[text()='Choose Files']")
    private WebElement fileUploadBtn;

    @FindBy(xpath = "//span[text()='Compress']")
    private WebElement compressBtn;

    @FindBy(xpath = "//div[text()='Done']")
    private WebElement compressStatus;

    @FindBy(xpath = "//span[text()='Download']")
    private WebElement downloadBtn;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement fileInput;

    public smallPDF_Homepage(WebDriver driver) {
        super(driver);
    }

    public void pdfCompressTool(){
        clickElement(Compress);
    }


    public void fileUpload(String filepath) throws InterruptedException {
        clickElement(fileUploadBtn);
        sendText(fileInput,filepath);

    }

    public void compressAndDownload(){
        clickElement(compressBtn);
        AssertionHelper.verifyTextEquals(compressStatus.getText(),"Done","Compress failed");
        clickElement(downloadBtn);
    }


}

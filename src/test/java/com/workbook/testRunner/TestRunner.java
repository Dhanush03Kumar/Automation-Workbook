package com.workbook.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/feature files",
        glue ={"com.workbook.ui_Automation.SeleniumWorkbook3"},
        plugin = {"pretty","json:target/cucumber-report.json", "html:target/cucumber-reports.html"},
        monochrome = true,
        tags = "@WorkBook3"
)

public class TestRunner extends AbstractTestNGCucumberTests {
    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

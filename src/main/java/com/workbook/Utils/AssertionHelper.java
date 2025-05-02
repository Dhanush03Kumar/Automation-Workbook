package com.workbook.Utils;
import org.testng.Assert;

public class AssertionHelper {

    public static void verifyTextEquals(String actualMessage, String expectedMessage, String message){
        Assert.assertEquals(actualMessage,expectedMessage,message);
    }

    public static void verifyTextContains(String actual,String expected, String message){
        Assert.assertNotNull(actual,"Text is null");
        String normalizedActual = actual.replaceAll("\\s+"," ");
        String normalizedExpected = expected.replaceAll("\\s+"," ");
        Assert.assertTrue(normalizedActual.contains(normalizedExpected),message+" | Expected to contain "+ expected );
    }
}

package cydeo.tests;

import cydeo.pages.AlertPracticePage;
import cydeo.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;

public class AlertPracticeTest {
    AlertPracticePage alertPracticePage = new AlertPracticePage();
    @Test
    public void jsAlerts(){
        Driver.getDriver().get("https://practice.cydeo.com/javascript_alerts");

        alertPracticePage.jsButton.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();
        String actualText = alertPracticePage.resultText.getText();
        String expectedText = "You entered: hello";
        Assert.assertEquals(actualText, expectedText);
        Driver.closeDriver();
    }
}

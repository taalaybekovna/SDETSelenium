package cydeo.tests;

import cydeo.pages.ExplicitWaitPracticePage;
import cydeo.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {
    ExplicitWaitPracticePage explicitWaitPracticePage = new ExplicitWaitPracticePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    @Test
    public void dynamicLoadOne(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
        explicitWaitPracticePage.startBtn.click();
        wait.until(ExpectedConditions.visibilityOf(explicitWaitPracticePage.userName));
        Assert.assertTrue(explicitWaitPracticePage.userName.isDisplayed());
        explicitWaitPracticePage.userName.sendKeys("tomsmith");
        explicitWaitPracticePage.password.sendKeys("incorrectpassword");
        explicitWaitPracticePage.submitBtn.click();
        Assert.assertTrue(explicitWaitPracticePage.resultText.isDisplayed());
    }

    @Test
    public void dynamicLoadSeven(){

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        Assert.assertTrue(explicitWaitPracticePage.doneMessage.isDisplayed());
        Assert.assertTrue(explicitWaitPracticePage.image.isDisplayed());
    }
}

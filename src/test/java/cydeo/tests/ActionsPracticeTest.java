package cydeo.tests;

import cydeo.pages.ActionsPracticePage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.Driver;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionsPracticeTest {

    ActionsPracticePage actionsPracticePage = new ActionsPracticePage();
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void hoverOverTest(){
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(actionsPracticePage.imgOne).perform();
        Assert.assertTrue(actionsPracticePage.nameOne.isDisplayed());

        actions.moveToElement(actionsPracticePage.imgTwo).perform();
        Assert.assertTrue(actionsPracticePage.nameTwo.isDisplayed());

        actions.moveToElement(actionsPracticePage.imgThree).perform();
        Assert.assertTrue(actionsPracticePage.nameThree.isDisplayed());


    }

    @Test()
    public void rightClickTest(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        actions.contextClick(actionsPracticePage.abTestLink)
                .sendKeys(Keys.ARROW_DOWN)
                        .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.RETURN)
                                .perform();
        Assert.assertEquals(Driver.getDriver().getTitle(), "No A/B Test");
    }

    @Test
    public void scrollDown(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());

        js.executeScript("arguments[0].scrollIntoView(true)", actionsPracticePage.cydeoLink, actionsPracticePage.homeLink);
        js.executeScript("arguments[1].scrollIntoView(true)", actionsPracticePage.cydeoLink, actionsPracticePage.homeLink);

    }
}

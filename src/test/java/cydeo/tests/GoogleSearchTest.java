package cydeo.tests;

import cydeo.pages.GoogleSearchPage;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;

import java.security.Key;

public class GoogleSearchTest {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Test
    public void GoogleSearchTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

        Assert.assertEquals(Driver.getDriver().getTitle(), "apple - Google Search");
    }

    @Test
    public void hardAssertionTest(){

        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

        Assert.assertEquals(Driver.getDriver().getTitle(), "apple - Google Search");

        System.out.println("This is from hard");

    }

    @Test
    public void softAssertionTest(){

        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(Driver.getDriver().getTitle(), "app - Google Search");
        System.out.println("This is from soft");

        softAssert.assertAll();

    }



}

package cydeo.tests;

import cydeo.pages.DropDownPage;
import cydeo.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class DropDownTest {
    DropDownPage dropDownPage = new DropDownPage();

//  @BeforeMethod
//    public void setUp(){
//        Driver.getDriver().get("http://practice.cydeo.com/dropdown");
//
//    }
    @Test
    public void stateDropDownTest(){

        Driver.getDriver().get("http://practice.cydeo.com/dropdown");

        Select stateSelect = new Select(dropDownPage.stateDropDown);
        stateSelect.selectByVisibleText("Illinois");
        String actual = stateSelect.getFirstSelectedOption().getText();
        String expected = "Illinois";
        Assert.assertEquals(actual, expected);

        stateSelect.selectByValue("VA");
        String actualOption = stateSelect.getFirstSelectedOption().getText();
        String expectedOption = "Virginia";
        Assert.assertEquals(actualOption, expectedOption);


        stateSelect.selectByIndex(5);
        String actualState = stateSelect.getFirstSelectedOption().getText();
        String expectedState = "California";
        Assert.assertEquals(actualState, expectedState);
        Driver.closeDriver();

    }

    @Test
    public void dateOfBirthDropDownTest(){

        Driver.getDriver().get("http://practice.cydeo.com/dropdown");

      Select yearSelect = new Select(dropDownPage.yearDropDown);
      yearSelect.selectByVisibleText("1950");
      String actualYear = yearSelect.getFirstSelectedOption().getText();
      String expectedYear = "1950";
      Assert.assertEquals(actualYear, expectedYear);

      Select monthSelect = new Select(dropDownPage.monthDropDown);
      monthSelect.selectByValue("11");
        String actualMonth = monthSelect.getFirstSelectedOption().getText();
        String  expectedMonth = "December";
        Assert.assertEquals(actualMonth, expectedMonth);

      Select daySelect = new Select(dropDownPage.dayDropDown);
      daySelect.selectByIndex(0);

        String actualDay = daySelect.getFirstSelectedOption().getText();
        String expectedDay = "1";
        Assert.assertEquals(actualDay, expectedDay);
        Driver.closeDriver();

    }

    @Test
    public void languagesDropDownTest(){

        Driver.getDriver().get("http://practice.cydeo.com/dropdown");

        Select languagesSelect = new Select(dropDownPage.languagesDropDown);
        List<WebElement> languagesOptions = languagesSelect.getOptions();

        for (WebElement eachOption : languagesOptions) {
            languagesSelect.selectByVisibleText(eachOption.getText());
            System.out.println(eachOption.getText());
            Assert.assertTrue(eachOption.isSelected());

        }

        languagesSelect.deselectAll();

        for (WebElement eachOption : languagesSelect.getOptions()) {
            Assert.assertTrue(!eachOption.isSelected());
            
        }
        Driver.closeDriver();

    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }


}

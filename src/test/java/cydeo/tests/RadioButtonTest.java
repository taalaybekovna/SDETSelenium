package cydeo.tests;

import cydeo.pages.RadioButtonPage;
import cydeo.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;

public class RadioButtonTest {
    RadioButtonPage radioButtonPage = new RadioButtonPage();
    @Test
    public void RadioButtonTest(){
    Driver.getDriver().get("http://practice.cydeo.com/radio_buttons");
    Assert.assertTrue(radioButtonPage.blueButton.isSelected());


    Assert.assertTrue(!radioButtonPage.footballButton.isSelected());

    radioButtonPage.footballButton.click();
        Assert.assertTrue(radioButtonPage.footballButton.isSelected());

        radioButtonPage.redButton.click();
        Assert.assertTrue(radioButtonPage.redButton.isSelected());

        Assert.assertTrue(!radioButtonPage.blueButton.isSelected());

        Assert.assertTrue(!radioButtonPage.greenButton.isEnabled());
}
}

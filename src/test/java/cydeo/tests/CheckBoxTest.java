package cydeo.tests;

import cydeo.pages.CheckBoxPage;
import cydeo.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;

public class CheckBoxTest {
    CheckBoxPage checkBoxPage = new CheckBoxPage();
    @Test
    public void checkBoxButtonTest(){

        Driver.getDriver().get("http://practice.cydeo.com/checkboxes");
        Assert.assertTrue(!checkBoxPage.checkBox1.isSelected());

        Assert.assertTrue(checkBoxPage.checkBox2.isSelected());

        checkBoxPage.checkBox1.click();
        checkBoxPage.checkBox2.click();
        Assert.assertTrue(checkBoxPage.checkBox1.isSelected());
        Assert.assertTrue(!checkBoxPage.checkBox2.isSelected());

        Driver.closeDriver();
    }











}


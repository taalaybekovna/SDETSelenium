package cydeo.tests;

import cydeo.pages.IframePracticePage;
import cydeo.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;

public class IframePracticeTest {
    IframePracticePage iframePracticePage = new IframePracticePage();
    @Test
    public void iframeTest(){
        Driver.getDriver().get("https://practice.cydeo.com/iframe");
        Driver.getDriver().switchTo().frame(0);
       // Driver.getDriver().switchTo().frame(iframePracticePage.iframe);
        String actualText = iframePracticePage.contentText.getText();
        String expectedText = "Your content goes here.";
        Assert.assertEquals(actualText,expectedText);

        Driver.getDriver().switchTo().defaultContent();
        String actualHead = iframePracticePage.headerText.getText();
        String expectedHeader = "An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertEquals(actualText, expectedText);
        Driver.closeDriver();
    }
}

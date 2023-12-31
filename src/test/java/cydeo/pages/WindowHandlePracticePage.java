package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowHandlePracticePage {
    public WindowHandlePracticePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Click Here")
    public WebElement clickLink;

    @FindBy(linkText = "CYDEO")
    public WebElement cydeoClickLink;
}

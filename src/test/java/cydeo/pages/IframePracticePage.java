package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframePracticePage {
    public IframePracticePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "mce_0_ifr")
    public WebElement iframe;

    @FindBy(xpath = "//p[.='Your content goes here.']")
    public WebElement contentText;

    @FindBy(xpath = "//h3[contains(text(),'the')]")
    public WebElement headerText;

}

package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPracticePage {

    public AlertPracticePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    public WebElement jsButton;

    @FindBy(id = "result")
    public WebElement resultText;

}

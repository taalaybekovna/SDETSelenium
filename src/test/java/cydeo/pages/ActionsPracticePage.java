package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsPracticePage {
    public ActionsPracticePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//img)[1]")
    public WebElement imgOne;

    @FindBy(xpath = "(//img)[2]")
    public WebElement imgTwo;

    @FindBy(xpath = "(//img)[3]")
    public WebElement imgThree;


    @FindBy(xpath = "//h5[.='name: user1']")
    public WebElement nameOne;

    @FindBy(xpath = "//h5[.='name: user2']")
    public WebElement nameTwo;

    @FindBy(xpath = "//h5[.='name: user3']")
    public WebElement nameThree;

    @FindBy(linkText = "A/B Testing")
    public WebElement abTestLink;

    @FindBy(linkText = "CYDEO")
    public WebElement cydeoLink;

    @FindBy(linkText = "Home")
    public WebElement homeLink;



}

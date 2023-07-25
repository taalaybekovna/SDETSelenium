package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage {

    public DropDownPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "state")
    public WebElement stateDropDown;

    @FindBy(id = "year")
    public WebElement yearDropDown;

    @FindBy(id = "month")
    public WebElement monthDropDown;

    @FindBy(id = "day")
    public WebElement dayDropDown;

    @FindBy(name = "Languages")
    public WebElement languagesDropDown;
}

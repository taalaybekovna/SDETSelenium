package cydeo.tests;

import com.github.javafaker.Faker;
import cydeo.pages.JavaFakerPage;
import cydeo.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;

public class JavaFakerTest {
    JavaFakerPage javaFakerPage = new JavaFakerPage();

    @Test
    public void setJavaFakerTest(){
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        javaFakerPage.username.sendKeys("Tester");
        javaFakerPage.password.sendKeys("test");
        javaFakerPage.loginButton.click();
        javaFakerPage.orderButton.click();

        Select select = new Select(javaFakerPage.dropDown);
        select.selectByVisibleText("FamilyAlbum");

        javaFakerPage.quantity.sendKeys("5");
        javaFakerPage.calculateBtn.click();

        Faker faker = new Faker();
        javaFakerPage.customerName.sendKeys(faker.name().firstName());
        javaFakerPage.street.sendKeys(faker.address().streetName());
        javaFakerPage.city.sendKeys(faker.address().cityName());
        javaFakerPage.zip.sendKeys(faker.address().zipCode().replace("-", ""));
        javaFakerPage.visa.click();
        javaFakerPage.cardNmr.sendKeys(faker.business().creditCardNumber().replace("-", ""));
        javaFakerPage.date.sendKeys(faker.business().creditCardExpiry().substring(0,2) + "/"
                + faker.business().creditCardExpiry().substring(2));
        javaFakerPage.processBtn.click();
        Assert.assertTrue(javaFakerPage.resultText.isDisplayed());
    }
}

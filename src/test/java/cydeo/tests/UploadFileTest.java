package cydeo.tests;

import cydeo.pages.UploadFilePage;
import cydeo.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;

public class UploadFileTest {
    @Test
    public void uploadFileTest(){
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        UploadFilePage uploadFilePage = new UploadFilePage();
        uploadFilePage.chooseFileButton.sendKeys("C:\\Users\\MSI GS76\\Downloads\\b10 all test cases, code.docx");
        uploadFilePage.uploadButton.click();
        Assert.assertEquals(uploadFilePage.resultText.getText(), "File Uploaded!");
    }
}

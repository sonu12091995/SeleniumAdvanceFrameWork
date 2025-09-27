package org.Selenium.Pages.Idrive360;

import org.Selenium.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.Selenium.Utils.WaitHelpers.waitJVM;

public class CreateAccountLink extends CommonToAllPage {

    WebDriver driver;
    public CreateAccountLink(WebDriver driver){
        this.driver = driver;   // assign properly
    }

    private By createAccountLink = By.xpath("//a[text()=\"Create new account\"]");

    public void clickOnCreateAccountLink(String iDriveUrl){
        driver.get(iDriveUrl);         // open URL properly
        waitJVM(5000);
        clickElement(createAccountLink);
    }
}

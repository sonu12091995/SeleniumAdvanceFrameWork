package org.Selenium.Pages.Idrive360;

import org.Selenium.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.Selenium.Utils.WaitHelpers.waitJVM;

public class IDirverMainPage extends CommonToAllPage {
    WebDriver driver;

    public IDirverMainPage(WebDriver driver){
        this.driver=driver;
    }

    private By title = By.xpath("//a[@title = \"Menu\"]");


    public void clickOnTitle(){
        waitJVM(5000);
        clickElement(title);
    }

}

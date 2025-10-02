package org.Selenium.Pages;

import org.Selenium.Utils.WaitHelpers;
import org.Selenium.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login extends CommonToAllPage {
    // Page Class
    // Page Locators
    // Page Actions
WebDriver driver;
    // Constructor
    public Amazon_Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ap_email")
    private WebElement Amazon_Email;

    @FindBy(id = "continue")
    private WebElement Amazon_Continue;

    @FindBy(id = "ap_password")
    private WebElement Amazon_Password;

    @FindBy(id = "signInSubmit")
    private WebElement Amazon_SignIn;


    public void Amazon_Logins(String mobile,String password){
        WaitHelpers.waitJVM(5000);
        Amazon_URL();
        enterInput(Amazon_Email,mobile);
        clickElement(Amazon_Continue);
        enterInput(Amazon_Password,password);
        clickElement(Amazon_SignIn);

    }

    public void Amazon_InvalidLogins(String mobile,String password){
        Amazon_URL();
        enterInput(Amazon_Email,mobile);
        clickElement(Amazon_Continue);
        enterInput(Amazon_Password,password);
        clickElement(Amazon_SignIn);
    }
}

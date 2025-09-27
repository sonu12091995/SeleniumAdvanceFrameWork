package org.Selenium.Pages.Idrive360;

import org.Selenium.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.Selenium.Utils.WaitHelpers.waitJVM;


public class CreateAccount extends CommonToAllPage {

        WebDriver driver;

        public CreateAccount(WebDriver driver) {

            this.driver = driver;
        }

        private By firstName = By.id("fname");
        private By lastName = By.id("lname");
        private By email = By.id("email");
        private By password = By.id("password");
        private By companyName = By.id("cname");
        private By phoneNumber = By.id("telnumSignup");
        private By createAccountButton = By.id("frm-btn");

        public  void createDriveAccount(String fName, String lName, String mail, String pass, String cName, String phone) {
            waitJVM(5000);
            enterInput(firstName,"fName");
            enterInput(lastName,"lName");
            enterInput(email,"mail");
            enterInput(password,"pass");
            enterInput(companyName,"companyName");
            enterInput(phoneNumber,"phone");
            clickElement(createAccountButton);

        }
    }
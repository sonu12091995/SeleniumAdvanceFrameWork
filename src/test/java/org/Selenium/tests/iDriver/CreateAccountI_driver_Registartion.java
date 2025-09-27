package org.Selenium.tests.iDriver;

import org.Selenium.Pages.Idrive360.CreateAccount;
import org.Selenium.Pages.Idrive360.CreateAccountLink;
import org.Selenium.Pages.Idrive360.IDirverMainPage;
import org.Selenium.Utils.PropertiesReader;
import org.Selenium.base.CommonToAllTest;
import org.testng.annotations.Test;

import static org.Selenium.Drivers.DriverManger.driver;
import static org.Selenium.Drivers.DriverManger.getDriver;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CreateAccountI_driver_Registartion extends CommonToAllTest {
    // This class can be used to implement test cases related to creating an account using iDriver.

    // Registarion with propert file dynamically
    @Test
    public void test_Idrive_Account_Payment() {
        CreateAccountLink createAccountLink = new CreateAccountLink(getDriver());
        createAccountLink.clickOnCreateAccountLink(PropertiesReader.readKey("iDrive_URL"));

        // After the link is clicked, go to registration form
        CreateAccount createAccount = new CreateAccount(getDriver());
        createAccount.createDriveAccount(
                PropertiesReader.readKey("firstName"),
                PropertiesReader.readKey("lastName"),
                PropertiesReader.readKey("MAil"),
                PropertiesReader.readKey("Pass"),
                PropertiesReader.readKey("company"),
                PropertiesReader.readKey("phoneNumber")
        );
    }
}


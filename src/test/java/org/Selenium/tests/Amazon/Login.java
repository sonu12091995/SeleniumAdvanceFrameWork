package org.Selenium.tests.Amazon;

import org.Selenium.Drivers.DriverManger;
import org.Selenium.Pages.Amazon_Login;
import org.Selenium.Utils.PropertiesReader;
import org.Selenium.base.CommonToAllTest;
import org.Selenium.listeners.RetryAnalyzer;
import org.testng.annotations.Test;



public class Login extends CommonToAllTest {
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginAmazon(){
        Amazon_Login amazonLogin = new Amazon_Login(DriverManger.getDriver());
        amazonLogin.Amazon_Logins(PropertiesReader.readKey("Amazon_username"), PropertiesReader.readKey("Amazon_password"));

    }

}

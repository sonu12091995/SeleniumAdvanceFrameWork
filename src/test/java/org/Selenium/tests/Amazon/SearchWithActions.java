package org.Selenium.tests.Amazon;

import org.Selenium.Drivers.DriverManger;
import org.Selenium.Pages.Amazon.AmazonSearchWithActions;
import org.Selenium.Pages.Amazon.Amazon_Login;
import org.Selenium.Pages.Amazon.Search;
import org.Selenium.Utils.PropertiesReader;
import org.Selenium.base.CommonToAllTest;
import org.Selenium.listeners.RetryAnalyzer;
import org.testng.annotations.Test;

public class SearchWithActions extends CommonToAllTest {
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void ActionSearhAmazon(){
        Amazon_Login amazonLogin = new Amazon_Login(DriverManger.getDriver());
        amazonLogin.Amazon_Logins(PropertiesReader.readKey("Amazon_username"), PropertiesReader.readKey("Amazon_password"));

        AmazonSearchWithActions searchPage = new AmazonSearchWithActions(DriverManger.getDriver());
        searchPage.searchProduct("Laptop");



    }

}

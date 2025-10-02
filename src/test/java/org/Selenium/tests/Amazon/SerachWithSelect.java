package org.Selenium.tests.Amazon;

import org.Selenium.Drivers.DriverManger;
import org.Selenium.Pages.Amazon.Amazon_Login;
import org.Selenium.Pages.Amazon.Search;
import org.Selenium.Utils.PropertiesReader;
import org.Selenium.base.CommonToAllTest;
import org.Selenium.listeners.RetryAnalyzer;
import org.testng.annotations.Test;

public class SerachWithSelect extends CommonToAllTest {


    @Test(retryAnalyzer = RetryAnalyzer.class)
    public  void searchByAction(){
        Amazon_Login amazonLogin = new Amazon_Login(DriverManger.getDriver());
        amazonLogin.Amazon_Logins(PropertiesReader.readKey("Amazon_username"), PropertiesReader.readKey("Amazon_password"));

        Search search  = new Search(DriverManger.getDriver());
        search.selectDropDown("search-alias=nowstore");



    }
}

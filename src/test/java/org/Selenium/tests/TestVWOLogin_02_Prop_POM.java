package org.Selenium.tests;


import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.Selenium.Drivers.DriverManger;
import org.Selenium.Pages.DashBoardPage;
import org.Selenium.Utils.PropertiesReader;
import org.Selenium.base.CommonToAllTest;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class TestVWOLogin_02_Prop_POM extends CommonToAllTest {

    //  D
    // L
    // V

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_02_Prop_POM.class);


    @Owner("PRAMOD")
    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() {

        logger.info("Starting the Testcases Page Object Model");


        // Page Class Code (POM Code) - 2 - L
        DashBoardPage loginPage = new DashBoardPage(DriverManger.getDriver());
        String error_msg = loginPage.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));

        // Assertions - 3 - V

        logger.info("Asserting the invalid credentials");

        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));



    }

    @Owner("PRAMOD")
    @Description("TC#2-Verify that valid creds dashboard page is loaded")
    @Test
    public void testLoginPositiveVWO() {

        logger.info("Starting the Testcases Page Object Model");


        // Page Class Code (POM Code) - 2 - L
        DashBoardPage loginPage_VWO = new DashBoardPage(DriverManger.getDriver());
        loginPage_VWO.loginToVWOLoginValidCreds(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

        DashBoardPage dashBoardPage  = new DashBoardPage(DriverManger.getDriver());
        String usernameLoggedIn = dashBoardPage.loggedInUserName();

        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
        logger.info("Done the Test cases");
        Assert.assertEquals(usernameLoggedIn,PropertiesReader.readKey("expected_username"));



    }


}

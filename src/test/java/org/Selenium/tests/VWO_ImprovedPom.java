package org.Selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.Selenium.Drivers.DriverManger;
import org.Selenium.Pages.ImporvedPom.DashBoardPage;
import org.Selenium.Pages.ImporvedPom.LoginPage;
import org.Selenium.Utils.PropertiesReader;
import org.Selenium.base.CommonToAllTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VWO_ImprovedPom extends CommonToAllTest {


    //  D
    // L
    // V

   // private static final Logger logger = LogManager.getLogger(TestVWOLogin_03_Prop_Improved_POM.class);


    @Owner("Sonu")
    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() {

        //logger.info("Starting the Testcases Page Object Model");


        // Page Class Code (POM Code) - 2 - L
        LoginPage loginPage = new LoginPage(DriverManger.getDriver());
        String error_msg = loginPage.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));
        // Assertions - 3 - V
        //logger.info("Asserting the invalid credentials");
        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));
    }

    @Owner("Sonu")
    @Description("TC#2-Verify that valid creds dashboard page is loaded")
    @Test
    public void testLoginPositiveVWO() {

        //logger.info("Starting the Testcases Page Object Model");


        // Page Class Code (POM Code) - 2 - L
        LoginPage loginPage_VWO = new LoginPage(DriverManger.getDriver());
        loginPage_VWO.loginToVWOLoginValidCreds(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));

        DashBoardPage dashBoardPage = new DashBoardPage(DriverManger.getDriver());
        String usernameLoggedIn = dashBoardPage.loggedInUserName();

        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
        //logger.info("Done the Test cases");
        Assert.assertEquals(usernameLoggedIn, PropertiesReader.readKey("expected_username"));

    }
}

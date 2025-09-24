package org.Selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.Selenium.Drivers.DriverManger;
import org.Selenium.Utils.TakeScreenShot;
import org.Selenium.listeners.RetryAnalyzer;
import org.Selenium.Pages.NormalPom.DashBoardPage;
import org.Selenium.Pages.NormalPom.LoginPage;
import org.Selenium.Utils.PropertiesReader;
import org.Selenium.base.CommonToAllTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@Test(retryAnalyzer = RetryAnalyzer.class)
public class RetryAnalyserTest extends CommonToAllTest {

    //private static final Logger logger = LogManager.getLogger(TestVWOLogin_02_Prop_POM.class);
    @Owner("Sonu")
    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() {

        //logger.info("Starting the Testcases Page Object Model");

        LoginPage loginPage = new LoginPage(DriverManger.getDriver()); // Page Class Code (POM Code) - 2 - L
        String error_msg = loginPage.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));

        //logger.info("Asserting the invalid credentials");

        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty(); // Assertions - 3 - V
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
        new TakeScreenShot();

    }
}


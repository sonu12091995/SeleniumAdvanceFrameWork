package org.Selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.Selenium.base.CommonToAllTest;
import org.Selenium.listeners.RetryAnalyzer;
import org.Selenium.listeners.ScreenshotListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.Selenium.Drivers.DriverManger.getDriver;


@Listeners(ScreenshotListener.class)
@Test(retryAnalyzer = RetryAnalyzer.class)

public class TakeScreenshot  extends CommonToAllTest {

    //private static final Logger logger = LogManager.getLogger(TestVWOLogin_05_TakeScreen_Retry_Prop_Improved_POM.class);

    @Owner("PRAMOD")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testFail() {
        getDriver().get("https://app.vwo.com");
        //logger.info("Starting the Testcases Page Object Model");
//        Allure.addAttachment("Log output", "text/plain", "This is some log text");
        Assert.assertTrue(false);
    }

    @Owner("PRAMOD")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testPass() {
        getDriver().get("https://app.vwo.com");
        //logger.info("Starting the Testcases Page Object Model");
        Assert.assertTrue(true);
    }





}

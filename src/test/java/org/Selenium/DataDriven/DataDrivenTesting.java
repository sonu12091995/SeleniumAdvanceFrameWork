package org.Selenium.DataDriven;

import org.Selenium.Drivers.DriverManger;
import org.Selenium.Pages.NormalPom.LoginPage;
import org.Selenium.Utils.PropertiesReader;
import org.Selenium.UtilsExcel.UtilExcel;
import org.Selenium.base.CommonToAllTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DataDrivenTesting extends CommonToAllTest {

    //private static final Logger logger = LogManager.getLogger(DataDrivenTesting.class);
    @Test(dataProvider = "getData")
    public void test_vwo_login(String email, String password) {

        // Page Class Code (POM Code) - 2 - L
        LoginPage loginPage = new LoginPage(DriverManger.getDriver());
        String error_msg = loginPage.loginToVWOLoginInvalidCreds(email,password);

        // Assertions - 3 - V

        //logger.info("Asserting the Invalid credentials");

        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));



    }




    @DataProvider
    public Object[][] getData(){
        // READ THE DATA FROM THE EXCEL FILE
        // GIVE THEM IN THE 2D ARRAY
        return UtilExcel.getTestDataFromExcel("sheet1");

    }
}

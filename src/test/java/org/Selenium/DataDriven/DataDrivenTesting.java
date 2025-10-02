package org.Selenium.DataDriven;
import org.Selenium.Drivers.DriverManger;
import org.Selenium.Pages.Amazon.Amazon_Login;
import org.Selenium.UtilsExcel.UtilExcel;
import org.Selenium.base.CommonToAllTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DataDrivenTesting extends CommonToAllTest {

    //private static final Logger logger = LogManager.getLogger(DataDrivenTesting.class);
    @Test(dataProvider = "getData")
    public void test_Amazon_login(String email, String password) {

        // Page Class Code (POM Code) - 2 - L
        Amazon_Login amazonLogin = new Amazon_Login(DriverManger.getDriver());
        amazonLogin.Amazon_InvalidLogins(email,password);

    /*    // Assertions - 3 - V

        //logger.info("Asserting the Invalid credentials");

        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));*/



    }




    @DataProvider
    public Object[][] getData(){
        // READ THE DATA FROM THE EXCEL FILE
        // GIVE THEM IN THE 2D ARRAY
        return UtilExcel.getTestDataFromExcel("sheet1");

    }
}

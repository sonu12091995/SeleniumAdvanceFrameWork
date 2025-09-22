package org.Selenium.base;

import org.Selenium.Drivers.DriverManger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {
        @BeforeMethod
        public void setUp(){
            DriverManger.init();
        }

        @AfterMethod
        public void tearDown(){
            DriverManger.down();
        }

    }

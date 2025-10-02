package org.Selenium.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


    public class SelectHelpers {

        private WebDriver driver;

        public SelectHelpers(WebDriver driver) {
            this.driver = driver;
        }

        // Select by visible text
        public void selectByVisibleText(By locator, String text) {
            WebElement element = driver.findElement(locator);
            Select select = new Select(element);
            select.selectByVisibleText(text);
        }

        // Select by value
        public void selectByValue(By locator, String value) {
            WebElement element = driver.findElement(locator);
            Select select = new Select(element);
            select.selectByValue(value);
        }

        // Select by WebElement
        public void selectByValue(WebElement element, String value) {
            Select select = new Select(element);
            select.selectByValue(value);
        }

        // Select by index
        public void selectByIndex(By locator, int index) {
            WebElement element = driver.findElement(locator);
            Select select = new Select(element);
            select.selectByIndex(index);
        }

        // Get selected option
        public String getSelectedOption(By locator) {
            WebElement element = driver.findElement(locator);
            Select select = new Select(element);
            return select.getFirstSelectedOption().getText();
        }
    }



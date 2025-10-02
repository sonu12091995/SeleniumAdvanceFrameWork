package org.Selenium.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionHelpers {
    private WebDriver driver;
    private Actions actions;

    public ActionHelpers(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    // ---------------- Hover ----------------
    public void hover(By locator) {
        WebElement element = driver.findElement(locator);
        actions.moveToElement(element).perform();
    }

    public void hover(WebElement element) {
        actions.moveToElement(element).perform();
    }

    // ---------------- Right Click ----------------
    public void rightClick(By locator) {
        WebElement element = driver.findElement(locator);
        actions.contextClick(element).perform();
    }

    public void rightClick(WebElement element) {
        actions.contextClick(element).perform();
    }

    // ---------------- Drag & Drop ----------------
    public void dragAndDrop(By sourceLocator, By targetLocator) {
        WebElement source = driver.findElement(sourceLocator);
        WebElement target = driver.findElement(targetLocator);
        actions.dragAndDrop(source, target).perform();
    }

    public void dragAndDrop(WebElement source, WebElement target) {
        actions.dragAndDrop(source, target).perform();
    }

    // ---------------- Type Text ----------------
    public void typeText(By locator, String text) {
        WebElement element = driver.findElement(locator);
        actions.moveToElement(element).click().sendKeys(text).perform();
    }

    public void typeText(WebElement element, String text) {
        actions.moveToElement(element).click().sendKeys(text).perform();
    }

    // ---------------- Click ----------------
    public void clickElement(By locator) {
        WebElement element = driver.findElement(locator);
        actions.moveToElement(element).click().perform();
    }

    public void clickElement(WebElement element) {
        actions.moveToElement(element).click().perform();
    }
}

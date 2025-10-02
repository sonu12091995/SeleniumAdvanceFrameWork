package org.Selenium.Pages.Amazon;

import org.Selenium.Utils.ActionHelpers;
import org.Selenium.base.CommonToAllPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchWithActions extends CommonToAllPage {
    WebDriver driver;
    ActionHelpers actionHelpers;

    public AmazonSearchWithActions(WebDriver driver){
        this.driver = driver;
        actionHelpers = new ActionHelpers(driver);
        PageFactory.initElements(driver, this); //
    }

    // Locators
    @FindBy(id = "twotabsearchtextbox")
    private WebElement SearchInput;

    @FindBy(id = "nav-search-submit-button") //
    private WebElement SearchButton;

    // Action method
    public void searchProduct(String productName){
        actionHelpers.typeText(SearchInput, productName);
        actionHelpers.clickElement(SearchButton);
    }
}
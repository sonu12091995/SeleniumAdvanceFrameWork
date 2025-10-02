package org.Selenium.Pages.Amazon;

import org.Selenium.Utils.SelectHelpers;
import org.Selenium.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Search extends CommonToAllPage {
    WebDriver driver;
    SelectHelpers selectHelpers;

    public Search(WebDriver driver){
        this.driver = driver;
        selectHelpers = new SelectHelpers(this.driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "searchDropdownBox")
    private WebElement selectCategory;

    public void selectDropDown(String categoryValue){
        selectHelpers.selectByValue(selectCategory, categoryValue);
    }
}
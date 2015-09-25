package com.codeseed.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Balaji on 24/09/15.
 */
public class HomePage {


    @FindBy(id = "gh-ac")
    public WebElement searchTextBox;
    @FindBy(id = "gh-btn")
    public WebElement searchButton;
    @FindBy(linkText = "Buy it now")
    public WebElement buyItNowOnly;
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(String strUrl) {
        driver.get(strUrl);
    }
    public void searchItem(String strText) {
        searchTextBox.click();
        searchTextBox.clear();
        searchTextBox.sendKeys(strText);
        searchButton.click();
       // buyItNowOnly.click();
    }

    public void clickShoppingCart() {

    }
}

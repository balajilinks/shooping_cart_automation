package com.codeseed.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Balaji on 24/09/15.
 */
public class ResultsPage {
    @FindBy(linkText = "Buy it now")
    public WebElement buyItNowOnly;
    @FindBy(css = "a.vip")
    public WebElement firstItem;
    @FindBy(linkText = "Add to basket")
    public WebElement addToBasket;
    WebDriver driver;

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void narrowSearch() {
        buyItNowOnly.click();
    }

    public String getFirstName() {
        return firstItem.getText();
    }

    public void selectFirstItem() {
        firstItem.click();
    }

    public void addToBasket() {
        addToBasket.click();
    }

}

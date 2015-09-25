package com.codeseed.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Balaji on 24/09/15.
 */
public class ShoppingCartPage {

    @FindBy(id = "gh-cart")
    public WebElement shoppingCartIkon;
    WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Open_ShoppingCart() {
        shoppingCartIkon.click();
    }

}

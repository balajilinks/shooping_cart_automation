package com.codeseed.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Balaji on 24/09/15.
 */
public class ResultsPage {
    @FindBy(linkText = "Buy it now")
    public WebElement buyItNowOnly;
    WebDriver driver;

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void narrowSearch() {
        buyItNowOnly.click();
    }

}

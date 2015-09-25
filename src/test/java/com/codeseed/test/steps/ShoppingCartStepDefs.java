package com.codeseed.test.steps;


import com.codeseed.test.pages.HomePage;
import com.codeseed.test.pages.ResultsPage;
import com.codeseed.test.pages.ShoppingCartPage;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.codeseed.test.SeleniumBase.getDriver;
import static com.codeseed.test.SeleniumBase.getScenario;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Balaji on 24/09/15.
 */
public class ShoppingCartStepDefs {

    public static Scenario scenario;
    public WebDriver driver;
    String itemName;
    public HomePage homePage;
    public ResultsPage resultsPage;
    public ShoppingCartPage shoppingCartPage;

    public ShoppingCartStepDefs() {
        driver = getDriver();
        scenario = getScenario();
        itemName = "";
        homePage = PageFactory.initElements(driver,HomePage.class);
        resultsPage = PageFactory.initElements(driver,ResultsPage.class);
        shoppingCartPage = PageFactory.initElements(driver,ShoppingCartPage.class);
    }

    @Given("^I have added an item to my cart$")
    public void i_have_added_an_item_to_my_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.navigateTo("http://www.ebay.co.uk/");
        homePage.searchItem("ipod mini");
        Thread.sleep(5000);
        resultsPage.narrowSearch();
        Thread.sleep(5000);
        itemName =  resultsPage.getFirstName();
        resultsPage.selectFirstItem();
        resultsPage.addToBasket();
        Thread.sleep(5000);
     /*  driver.get("http://www.ebay.co.uk/");
        driver.findElement(By.id("gh-ac")).click();
        driver.findElement(By.id("gh-ac")).clear();
        driver.findElement(By.id("gh-ac")).sendKeys("ipod nano");
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(5000);  // need to remove the wait statements
        driver.findElement(By.linkText("Buy it now")).click();
        Thread.sleep(5000);
        itemName = driver.findElement(By.cssSelector("a.vip")).getText();
        driver.findElement(By.cssSelector("a.vip")).click();
        driver.findElement(By.linkText("Add to basket")).click();
        Thread.sleep(5000);*/
    }

    @When("^I view the contents of my cart$")
    public void i_view_the_contents_of_my_cart() throws Throwable {
        shoppingCartPage.Open_ShoppingCart();
        assertEquals("Your eBay shopping basket", driver.getTitle());
    }

    @Then("^I should see the contents of the cart include the item$")
    public void i_should_see_the_contents_of_the_cart_include_the_item() throws Throwable {
        assertEquals("Your eBay shopping basket", driver.getTitle());
        assertTrue(driver.getPageSource().contains(itemName));  // Need to improve the Assertion
    }


}

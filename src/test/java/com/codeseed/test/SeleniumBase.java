package com.codeseed.test;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.Augmenter;

import java.util.HashMap;

/**
 * Created by Balaji on 24/09/15.
 */

public class SeleniumBase {

    public static WebDriver driver;
    public static Scenario scenario;
    private BrowserSelection browserSelection = new BrowserSelection();

    public static WebDriver getDriver() {
        return driver;
    }

    public static Scenario getScenario() {
        return scenario;
    }


    @Before()
    public void prepare(Scenario scenario) {
        driver = browserSelection.select();
        this.scenario = scenario;
    }

    @After
    public void cleanUp(Scenario scenario) {
        String sauceLab = System.getProperty("sauceLab");
        // Add Screen shot for failure
        if (scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot;
                if ("true".contentEquals(sauceLab)) {
                    WebDriver augmentedDriver = new Augmenter().augment(driver);
                    screenshot = ((TakesScreenshot) augmentedDriver)
                            .getScreenshotAs(OutputType.BYTES);
                } else {
                    screenshot = ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.BYTES);
                }
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots
                        .getMessage());
            }
        }
        try {
            driver.close();
            driver.quit();

        } catch (Exception e) {
            System.out.print("Driver already closed");
        }
    }
}

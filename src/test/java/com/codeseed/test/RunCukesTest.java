package com.codeseed.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Balaji on 24/09/15.
 */


@CucumberOptions(monochrome = true, format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},

        features = "src/test/resources/features")
public class RunCukesTest extends AbstractTestNGCucumberTests {

}

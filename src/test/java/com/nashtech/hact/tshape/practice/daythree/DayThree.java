package com.nashtech.hact.tshape.practice.daythree;

import com.nashtech.hact.tshape.pom.HomePage;
import com.nashtech.hact.tshape.pom.ProductPage;
import com.nashtech.hact.tshape.practice.SetingUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DayThree {
    private static WebDriver driver;

    @BeforeClass
    void setup() {
        driver =  SetingUp.setUp();
    }

    @Test
    void pageTestCaseDisplaySuccessful() {
        // Step 1 + 2
        driver.get("https://automationexercise.com");
        // Step 3
        String expectedTitle = "Automation Exercise";
        // fetch the title of the web page and save it into a string variable
        boolean result = ExpectedConditions.titleIs(expectedTitle).apply(driver);
        Assert.assertTrue(result);
        HomePage.navigateToTestCasePage(driver);
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.titleIs("Automation Practice Website for UI Testing - Test Cases"));
        String testCaseHeadingTitleSelector = "h2[class='title text-center']";
        WebElement element = driver.findElement(new By.ByCssSelector(testCaseHeadingTitleSelector));
        Assert.assertEquals(element.getText(), "TEST CASES");
    }

    @Test
    void pageProductDisplaySuccessful() {
        // Step 1 + 2
        driver.get("https://automationexercise.com");
        // Step 3
        String expectedTitle = "Automation Exercise";
        // fetch the title of the web page and save it into a string variable
        boolean result = ExpectedConditions.titleIs(expectedTitle).apply(driver);
        Assert.assertTrue(result);
        HomePage.navigateToTestCasePage(driver);
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.titleIs("Automation Exercise - All Products"));
        String testCaseHeadingTitleSelector = "h2[class='title text-center']";
        WebElement element = driver.findElement(new By.ByCssSelector(testCaseHeadingTitleSelector));
        Assert.assertEquals(element.getText(), "CATEGORY");
        ProductPage.searchProduct(driver, "polo");
        String productResultTitle = "/html/body/section[2]/div/div/div[2]/div/h2";
        WebElement productResultTitleElement = driver.findElement(new By.ByXPath(productResultTitle));
        Assert.assertEquals(productResultTitleElement.getText(),"Searched Products");
    }

    @AfterClass
    void cleanUp() {
        driver.quit();
    }
}

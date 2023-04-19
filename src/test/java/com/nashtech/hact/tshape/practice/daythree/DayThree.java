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
        Assert.assertEquals(driver.getTitle(),expectedTitle);
        HomePage.navigateToTestCasePage(driver);
        String testCaseHeadingTitleSelector = "h2[class='title text-center']";
        WebElement element = driver.findElement(new By.ByCssSelector(testCaseHeadingTitleSelector));
        Assert.assertEquals(element.getText(), "TEST CASES");
    }

    @Test
    void pageProductDisplaySuccessful() throws InterruptedException {
        // Step 1 + 2
        driver.get("https://automationexercise.com");
        // Step 3
        String expectedTitle = "Automation Exercise";
        // fetch the title of the web page and save it into a string variable
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        HomePage.navigateToProductPage(driver);

        Assert.assertEquals(driver.getTitle(), "Automation Exercise - All Products");
        ProductPage.searchProduct(driver, "polo");
        String productResultTitle = "/html/body/section[2]/div/div/div[2]/div/h2";
        WebElement productResultTitleElement = driver.findElement(new By.ByXPath(productResultTitle));
        Assert.assertEquals(productResultTitleElement.getText(),"SEARCHED PRODUCTS");
    }

    @AfterClass
    void cleanUp() {
        driver.quit();
    }
}

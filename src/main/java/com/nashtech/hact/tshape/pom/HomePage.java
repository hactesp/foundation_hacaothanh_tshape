package com.nashtech.hact.tshape.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private static String xPathTestCase = "a[href='/test_cases']";
    private static String xPathProduct = "a[href='/products']";
    private static String xPathLoginSignUp = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a";

    public static void navigateToLoginPage(WebDriver driver) {
        WebElement element = driver.findElement(new By.ByXPath(xPathLoginSignUp));
        element.click();
    }

    public static void navigateToTestCasePage(WebDriver driver) {
        WebElement element = driver.findElement(new By.ByCssSelector(xPathTestCase));
        element.click();
        Actions actions = new Actions(driver);
        actions.moveByOffset(10, 10).click().perform();
    }

    public static void navigateToProductPage(WebDriver driver) {
        WebElement element = driver.findElement(new By.ByCssSelector(xPathProduct));
        element.click();
        Actions actions = new Actions(driver);
        actions.moveByOffset(10, 10).click().perform();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.urlContains("products"));
    }

}

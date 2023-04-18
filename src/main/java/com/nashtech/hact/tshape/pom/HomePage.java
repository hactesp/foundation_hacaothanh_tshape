package com.nashtech.hact.tshape.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private static String xPathTestCase = "a[href='/test_cases']";
    private static String xPathBody = "body";
    private static String xPathLoginSignUp = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a";

    public static void navigateToLoginPage(WebDriver driver) {
        WebElement element = driver.findElement(new By.ByXPath(xPathLoginSignUp));
        element.click();
    }

    public static void navigateToTestCasePage(WebDriver driver) {
        WebElement element = driver.findElement(new By.ByCssSelector(xPathTestCase));
        element.click();
//        WebElement elementBody = driver.findElement(new By.ByCssSelector(xPathTestCase));
//        Actions actions = new Actions(driver);
//        actions.moveByOffset(10, -10).perform();
//        elementBody.click();
    }

}

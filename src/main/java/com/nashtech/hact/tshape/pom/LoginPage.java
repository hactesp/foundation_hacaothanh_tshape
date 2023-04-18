package com.nashtech.hact.tshape.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static String userNameSelector = "input[data-qa='login-email']";
    private static String passwordSelector = "input[data-qa='login-password']";
    private static String loginButtonSelector = "input[data-qa='login-password']";
    public static void login(WebDriver driver, String userName, String password) {
        enterUserName(driver, userName);
        enterPassword(driver, password);
        clickLogin(driver);
    }
    static void enterUserName(WebDriver driver,String userName) {
        WebElement element = driver.findElement(By.cssSelector(userNameSelector));
        element.sendKeys(userName);
    }

    static void enterPassword(WebDriver driver, String password) {
        WebElement element = driver.findElement(By.cssSelector(passwordSelector));
        element.sendKeys(password);
    }

    static void clickLogin(WebDriver driver) {
        WebElement loginButton = driver.findElement(By.cssSelector(loginButtonSelector));
        loginButton.sendKeys(Keys.RETURN);
    }
}

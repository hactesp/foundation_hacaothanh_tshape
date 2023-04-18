package com.nashtech.hact.tshape.practice.daytwo;

import com.nashtech.hact.tshape.practice.SetingUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DayTwo {
    private static WebDriver driver;
    public static void main(String[] args) {
        DayTwo dayTwo = new DayTwo();
        driver =  SetingUp.setUp();
        dayTwo.exampleOne();
//        dayTwo.exampleTwo();
    }

    void exampleOne() {
        // Step 1 + 2
        driver.get("https://automationexercise.com");
        // Step 3
        String expectedTitle = "Automation Exercise";
        // fetch the title of the web page and save it into a string variable
        boolean result = ExpectedConditions.titleIs(expectedTitle).apply(driver);
        if (result) {
            System.out.println("Title is corrected");
        }

        // Step 4
        String xPathLoginSignUp = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a";
        WebElement element = driver.findElement(new By.ByXPath(xPathLoginSignUp));
        element.click();
        System.out.println("Navigate to signup/login page");

        // Step 5
        String loginToAccountText = "Login to your account";
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
        String actualText = element1.getText();
        if (loginToAccountText.equals(actualText)) {
            System.out.println("Form matched");
        }

        // Step 6 + 7
        String userNameSelector = "input[data-qa='login-email']";
        String passwordSelector = "input[data-qa='login-password']";
        String loginButtonSelector = "input[data-qa='login-password']";
        WebElement userName = driver.findElement(By.cssSelector(userNameSelector));
        WebElement password = driver.findElement(By.cssSelector(passwordSelector));
        WebElement loginButton = driver.findElement(By.cssSelector(loginButtonSelector));
        userName.sendKeys("testusername");
        password.sendKeys("this is test password");
        loginButton.click();

        // Step 8
        String errorPath = "//*[@id=\"form\"]/div/div/div[1]/div/form/p";
        WebElement error = driver.findElement(By.xpath(errorPath));
        WebElement form = driver.findElement(By.id("//*[@id=\"form\"]/div/div/div[1]/div/form"));
        form.submit();
        if (error.getText().equals("Your email or password is incorrect!")) {
            System.out.println("Catch Error");
        }
    }
    void exampleTwo() {
        // Step 1 + 2
        driver.get("https://automationexercise.com");
        // Step 3
        String expectedTitle = "Automation Exercise";
        // fetch the title of the web page and save it into a string variable
        boolean result = ExpectedConditions.titleIs(expectedTitle).apply(driver);
        if (result) {
            System.out.println("Title is corrected");
        }

        // Step 4
        String xPathLoginSignUp = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a";
        WebElement element = driver.findElement(new By.ByXPath(xPathLoginSignUp));
        element.click();
        System.out.println("Navigate to signup/login page");

        // Step 5
        String loginToAccountText = "Login to your account";
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
        String actualText = element1.getText();
        if (loginToAccountText.equals(actualText)) {
            System.out.println("Form matched");
        }

        // Step 6 + 7
        String userNameSelector = "input[data-qa='login-email']";
        String passwordSelector = "input[data-qa='login-password']";
        String loginButtonSelector = "input[data-qa='login-password']";
        WebElement userName = driver.findElement(By.cssSelector(userNameSelector));
        WebElement password = driver.findElement(By.cssSelector(passwordSelector));
        WebElement loginButton = driver.findElement(By.cssSelector(loginButtonSelector));
        userName.sendKeys("testemail0121@gmail.com");
        password.sendKeys("testemail0121");
        loginButton.submit();

        // Step 8
        String loginAsUser = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a";
        WebElement loginAsUserElement = driver.findElement(By.xpath(loginAsUser));
        if (loginAsUserElement.getText().equals("Logged in as Cao Hà")) {
            System.out.println("User Logged In");
        }
    }
}

package com.nashtech.hact.tshape.practice.daytwo;

import com.nashtech.hact.tshape.pom.HomePage;
import com.nashtech.hact.tshape.pom.LoginPage;
import com.nashtech.hact.tshape.practice.SetingUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;


public class DayTwo {
    private static WebDriver driver;

    @BeforeClass
    void setup() {
        driver =  SetingUp.setUp();
    }

    @BeforeMethod
    void beforeEachMethod() {
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
        HomePage.navigateToLoginPage(driver);
    }

    @Test
    void exampleOne() {
        // Step 5
        String loginToAccountText = "Login to your account";
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
        String actualText = element1.getText();
        Assert.assertEquals(actualText, loginToAccountText);

        // Step 6 + 7
        LoginPage.login(driver, "testusername@gmail.com", "this is test password");

        // Step 8
        String errorPath = "//*[@id=\"form\"]/div/div/div[1]/div/form/p";
        WebElement error = driver.findElement(By.xpath(errorPath));
        Assert.assertEquals(error.getText(), "Your email or password is incorrect!");
    }
    @Test
    void exampleTwo() {
        // Step 5
        String loginToAccountText = "Login to your account";
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
        String actualText = element1.getText();
        if (loginToAccountText.equals(actualText)) {
            System.out.println("Form matched");
        }

        // Step 6 + 7
        String userName = "testemail0121@gmail.com";
        String password = "testemail0121";
        LoginPage.login(driver,userName, password);

        // Step 8
        String loginAsUser = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a";
        WebElement loginAsUserElement = driver.findElement(By.xpath(loginAsUser));
        Assert.assertEquals(loginAsUserElement.getText(), "Logged in as Cao Hà");
    }

    @AfterClass
    void cleanup() {
        driver.close();
        driver.quit();
    }
}

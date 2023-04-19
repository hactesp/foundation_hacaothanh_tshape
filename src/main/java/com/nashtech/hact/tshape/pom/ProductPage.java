package com.nashtech.hact.tshape.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    private  static String productSearchInput = "search_product";
    private  static String productSearchButton = "submit_search";

    public static void searchProduct(WebDriver driver, String productName) {
        WebElement element = driver.findElement(new By.ById(productSearchInput));
        element.sendKeys(productName);

        WebElement buttonSearch = driver.findElement(new By.ById(productSearchButton));
        buttonSearch.sendKeys(Keys.RETURN);
    }
}

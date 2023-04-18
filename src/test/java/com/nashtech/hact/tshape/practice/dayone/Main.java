package com.nashtech.hact.tshape.practice.dayone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.out.print("Setting Up!");
        System.setProperty("webdriver.chrome.driver","/Users/hact/Downloads/chromedriver_mac64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }
}
package com.nashtech.hact.tshape.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetingUp {
    /**
     * Currently I using chrome driver only
     * We can have some change to make it dynamic in the future :D
     * @return Driver for webdriver
     */
    public static WebDriver setUp (){
        System.out.print("Setting Up!");
        System.setProperty("webdriver.chrome.driver","/Users/hact/Downloads/chromedriver_mac64/chromedriver");
        return new ChromeDriver();
    }
}

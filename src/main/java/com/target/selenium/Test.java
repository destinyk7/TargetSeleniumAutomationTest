package com.target.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Test {

    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.target.com");
        WebElement searchBox;
        searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("iPhone");
        searchBox.submit();
        driver.quit();
    }
}
package com.selenium.formyproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\DCruz\\08 Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
        dropdown.click();

        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.click();
        

        driver.quit();
    }
}

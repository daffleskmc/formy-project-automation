package com.selenium.formyproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {

    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "D:\\DCruz\\08 Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement address = driver.findElement(By.id("autocomplete"));
        address.sendKeys("30 Darlinghurst Road, Potts Point");

//        Thread.sleep(1000); // not best option but helps slow down
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
        autocompleteResult.click();
//        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
//        autocompleteResult.click();

//        driver.quit();
    }
}

package com.selenium.programming.knowledge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooksPwakitAppspot {
    public static void main(String[] args) {
        // 1. OPEN THE CHROME BROWSER
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omenr\\IdeaProjects\\JAR\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();


        // 2. NAVIGATE TO THE URL
        String URL = "https://books-pwakit.appspot.com/";
        driver.get(URL);

        driver.findElement(By.xpath("//input[@id='input")).sendKeys("test");

    }
}

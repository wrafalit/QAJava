package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        // 1. OPEN THE CHROME BROWSER
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omenr\\IdeaProjects\\JAR\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        // 2. NAVIGATE TO THE URL
//        driver.get("https://www.google.com");
//
//        // 3. CLOSE THE BROWSER
//        driver.close();

        // 1. OPEN THE CHROME BROWSER
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omenr\\IdeaProjects\\JAR\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();


        // 2. NAVIGATE TO THE URL
        String URL = "http://automationpractice.com/index.php";
        driver.get(URL);

        // BY ID
//        driver.findElement(By.id("search_query_top")).sendKeys("t-shirt");
//        WebElement search = driver.findElement(By.id("search_query_top"));
//        search.sendKeys("T-Shirt");

        //BY name
//        driver.findElement(By.name("search_query")).sendKeys("socks");

        //BY Link text/ partial text
//        driver.findElement(By.linkText("Printed Summer Dress")).click();
//        driver.findElement(By.partialLinkText("Summer Dress"));

        //BY CSS Selector
        driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("pants");
        driver.quit();


    }
}

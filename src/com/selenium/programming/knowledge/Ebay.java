package com.selenium.programming.knowledge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
    public static void main(String[] args) {
        // 1. OPEN THE CHROME BROWSER
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omenr\\IdeaProjects\\JAR\\chromedriver61.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();


        // 2. NAVIGATE TO THE URL
        String URL = "https://ebay.com/";
        driver.get(URL);

//        XPath Absolute
//        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[5]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("ipad");
//        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[5]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();

//        Xpat relative
//        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("ps5");
//        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Sell')]")).click();
    }
}

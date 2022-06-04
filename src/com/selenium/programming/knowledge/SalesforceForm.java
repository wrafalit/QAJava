package com.selenium.programming.knowledge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceForm {

    public static void main(String[] args) {
        // 1. OPEN THE CHROME BROWSER
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omenr\\IdeaProjects\\JAR\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();


        // 2. NAVIGATE TO THE URL
        String URL = "https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus";
        driver.get(URL);

        // XPath Access
        // Self node
        driver.findElement(By.xpath("//input[@id='CompanyName-BbYX']/self::input")).sendKeys("ABC");
    }
}

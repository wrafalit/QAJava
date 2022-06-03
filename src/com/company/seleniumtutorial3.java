package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class seleniumtutorial3 {

    public static void main(String[] args) {
        // 1. OPEN THE CHROME BROWSER
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omenr\\IdeaProjects\\JAR\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();


        // 2. NAVIGATE TO THE URL
        String URL = "http://www.google.com";
        driver.get(URL);

        // BY TAGName

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for (WebElement link : links) {
            System.out.println(link.getText());
        }
    }
}

package com.selenium.programming.knowledge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmlive {
    public static void main(String[] args) {
        // 1. OPEN THE CHROME BROWSER
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omenr\\IdeaProjects\\JAR\\chromedriver61.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();


        // 2. NAVIGATE TO THE URL
        String URL = "https://opensource-demo.orangehrmlive.com/";
        driver.get(URL);

//        Enter valid username
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
//        Enter valid passwoed
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//        Submit
        driver.findElement(By.name("Submit")).click();

//      Verify url
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        String desiredURL = "https://opensource-demo.orangehrmlive.com/index.php/dash";
        if (currentURL.equals(desiredURL)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

//        Title verify
        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);
        String desiredTitle = "OrangeHRM";
        if (currentTitle.equals(desiredTitle)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        String source = driver.getPageSource();
        System.out.println(source);
        driver.quit();


    }
}

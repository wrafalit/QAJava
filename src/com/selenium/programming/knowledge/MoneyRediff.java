package com.selenium.programming.knowledge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MoneyRediff {

    public static void main(String[] args) {
        // 1. OPEN THE CHROME BROWSER
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omenr\\IdeaProjects\\JAR\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();


        // 2. NAVIGATE TO THE URL
        String URL = "https://money.rediff.com/gainers";
        driver.get(URL);

        //      self node
        String selfNode = driver.findElement(By.xpath("//a[normalize-space()='Filtra Consultants &']")).getText();
        System.out.println("The self node is " + selfNode);


        //      parent node
        String parentNode = driver.findElement(By.xpath("//a[contains(.,'Filtra Consultants &')]/parent::td")).getText();
        System.out.println("The parent node is " +parentNode);

        //      child nodes
        List<WebElement> childNodes = driver.findElements(By.xpath("//a[contains(.,'Filtra Consultants &')]/ancestor::tr/child::*"));
        System.out.println("The child nodes are " + childNodes.size());

        //  Ancestor
        String ancestorNode = driver.findElement(By.xpath("//a[contains(.,'Filtra Consultants &')]/ancestor::tr")).getText();
        System.out.println("The ancestor is " +ancestorNode);

        //  Following
        List<WebElement> follownigtags = driver.findElements(By.xpath("//a[contains(.,'Filtra Consultants &')]/following::*"));
        System.out.println("The following tags are " + follownigtags.size());

        // Following siblings
        List<WebElement> followingsiblings = driver.findElements(By.xpath("//a[contains(.,'Filtra Consultants &')]/ancestor::tr/following-sibling::*"));
        System.out.println("The following siblings are " + followingsiblings.size());

        // Preceding sibling
        List<WebElement> precedingsiblings = driver.findElements(By.xpath("//a[contains(.,'Filtra Consultants &')]/ancestor::tr/preceding-sibling::*"));
        System.out.println("The preceding siblings are " + precedingsiblings.size());
    }
}

package com.sreekanth.revisionMavenTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTestPracticeLaunch {

    @Test
    public void LaunchBrowser() {

        WebDriver driver = new ChromeDriver();
        
        WebDriverManager.chromedriver().setup();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        
        System.out.println("I am from Automation Practice Site");

        System.out.println("Page Title : " + driver.getTitle());

        driver.quit();
    }
}
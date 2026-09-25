package com.sreekanth.revisionMavenTestNG;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TutorialsPointLaunch {
	
	@Test
	public void LaunchTutorialPoint() {
		
		WebDriver driver =new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		System.out.println(("I am from TutorialsPoint Testing Site"));
		System.out.println("Page Title is: "+driver.getTitle());

		System.out.println("Current URL of the Page is: "+driver.getCurrentUrl());
		
		driver.quit();	
}

}

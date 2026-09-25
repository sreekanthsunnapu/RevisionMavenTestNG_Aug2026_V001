package com.sreekanth.revisionMavenTestNG;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLaunch {

	@Test
	public void testGoogle() {

		System.out.println("From Test Google Method");
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		driver.get("https://www.google.com");
		System.out.println("I am From Google.com");
		System.out.println("Page Title is:" + driver.getTitle());
		System.out.println("Thank You");

		driver.quit();

	}
}

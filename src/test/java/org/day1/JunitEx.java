package org.day1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitEx {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setupWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Before
	public void browserLaunch() {
		driver.get("https://www.facebook.com/login/");
	}
	
	@Test
	public void valuesEnter() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Vicky");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345");
	}
	
	@After
	public void login() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}
	
	@AfterClass
	public static void tc05() {
		String ExpectMessage = "ExpectMessage";
		String ActualMessage = "ActualMessage";
		if(ExpectMessage.equals(ActualMessage)) {
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test fail");
		}
		
	}

}

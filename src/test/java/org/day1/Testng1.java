package org.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Testng1 {
public static WebDriver driver;
	
	@Test(priority=0)
	public static void setupWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test(priority=1)
	public void browserLaunch() {
		driver.get("https://www.facebook.com/login/");
	}
	@Parameters({"user","pass"})
	@Test(priority=2)
	public void valuesEnter(String user,String pass) {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(user);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pass);
	}
	
	@Test(priority=3,invocationCount=5,enabled=false)
	public void login() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}
	
	@Test(priority=4)
	public static void tc05() {
		String ExpectMessage = "ExpectMessage";
		String ActualMessage = "ActualMessage";
//		Assert.assertEquals("Expected","Actual");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("actual", "expected");
		System.out.println("Mithra");
		if(ExpectMessage.equals(ActualMessage)) {
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test fail");
		}
		
	}

}

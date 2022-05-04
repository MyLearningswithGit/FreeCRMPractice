package com.crm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class JSExecutorDemo {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("The title of the page is:: "+ title);
		Assert.assertEquals(title, "Google");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

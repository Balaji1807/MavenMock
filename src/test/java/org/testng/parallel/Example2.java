package org.testng.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example2 {
	
	public static WebDriver d;
	
	@BeforeClass
	public static void launchBrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		d=new InternetExplorerDriver();
	}
		@Test
	public void test2()
	{
		d.get("https://www.facebook.com");
		WebElement emailField = d.findElement(By.id("email"));
		emailField.sendKeys("divya");
		WebElement passField = d.findElement(By.id("pass"));
		passField.sendKeys("apaa");
		
		System.out.println("test 1:"+Thread.currentThread().getId());
	}
}

package org.testng.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1{
	
	public static WebDriver d;
	
	@BeforeClass
	public static void launchBrowser()
	{
	  WebDriverManager.chromedriver().setup();
	  d=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		d.get("https://www.facebook.com");
		WebElement emailField = d.findElement(By.id("email"));
		emailField.sendKeys("balaji");
		WebElement passField = d.findElement(By.id("pass"));
		passField.sendKeys("balaji");
		
		System.out.println("test 1:"+Thread.currentThread().getId());
	}


}

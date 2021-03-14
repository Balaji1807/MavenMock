package org.testng.real1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {
	
	public static WebDriver d;
	
	@BeforeClass
	public static void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		 d=new ChromeDriver();
	}
	
	@Parameters({"email","password"})
	@Test
	public void test1(@Optional("java") String email,@Optional("selenium") String password )
	{
		d.get("https://www.facebook.com");
		WebElement Email = d.findElement(By.id("email"));
		Email.sendKeys(email);
		
		WebElement pass = d.findElement(By.id("pass"));
		pass.sendKeys(password);
		
		WebElement click = d.findElement(By.name("login"));
		click.click();
		}
	
	

	}

package org.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleData {
	
	public static WebDriver d;
	
	@BeforeClass
	public static void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
	}
	
	@Test(dataProvider="SampleData")
	public void test1(String email,String pass) throws InterruptedException
	{
		d.get("https://www.facebook.com");
		WebElement emailField = d.findElement(By.id("email"));
		emailField.sendKeys(email);
		WebElement passField = d.findElement(By.id("pass"));
	    passField.sendKeys(pass);
	    WebElement button = d.findElement(By.name("login"));
	    button.click();
	    Thread.sleep(3000);
	}
	
	@DataProvider(name="SampleData")
	public Object[][] data()
	{
		return new Object[][] {
			
			{"java","selenium"},
			{"python","selenium"},
			{"ruby","selenium"},
			{"java","sql"}
		};
	}

}

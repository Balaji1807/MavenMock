package org.testng;
import java.util.Date;

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

public class WebMock {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
}
	@AfterClass
	public static void closeBrowser()
	{
		driver.close();
	}
	@Before
	public void start()
	{
		Date date =new Date();
		System.out.println(date);
	}
	@After
	public void end()
	{
		Date date=new Date();
		System.out.println(date);
	}
    @Test
    public  void test1() throws InterruptedException
    {
    	driver.get("https://www.facebook.com/");
    	WebElement email= driver.findElement(By.id("email"));
    	email.sendKeys("balaji");
    	Assert.assertEquals("check the url of webpage", "balaji","email");
    	
    	WebElement pass=driver.findElement(By.id("pass"));
    	pass.sendKeys("mass123");
    	WebElement login = driver.findElement(By.name("login"));
    	login.click();
    	Thread.sleep(6000);
    	
    	
    	
    }
    @Test
    public  void test2() throws InterruptedException
    {
    	driver.get("https://www.facebook.com/");
    	WebElement email= driver.findElement(By.id("email"));
    	email.sendKeys("akash");
    	Assert.assertEquals("check the url of webpage", "akash","email");
    	WebElement pass=driver.findElement(By.id("pass"));
    	pass.sendKeys("mas123");
    	WebElement login = driver.findElement(By.name("login"));
    	login.click();
    	Thread.sleep(6000);
    	
    	
    	
    }
}

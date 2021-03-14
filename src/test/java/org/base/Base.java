package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver d;
	public static WebDriver launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balaji\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		 return d=new ChromeDriver();
		
	}
	
	public static  void launchUrl(String url)
	{
		d.get(url);
	}
	
	public static  void data(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	
	public  static void press(WebElement pressButton) {
		pressButton.click();
	}
}

package org.adactin.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver d;
	
	public static WebDriver launchBrowser()
	{
	  WebDriverManager.chromedriver().setup();
	  return d=new ChromeDriver();
	  
	}
	
	public static void launchUrl(String url)
	{
		d.get(url);
	}

	public static void fill(WebElement element,String data)
	{
		element.sendKeys(data);
	}

	public static void btnClick(WebElement element )
	{
		element.click();
	}

}

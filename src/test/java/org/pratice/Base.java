package org.pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static  WebDriver d;

	public static  WebDriver launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		return d=new ChromeDriver();
	}
	public static void launchUrl(String URL)
	{
		d.get(URL);
	}
	public static void windowMax()
	{
		d.manage().window().maximize();
	}
	public static void data(WebElement element,String txt)
	{
		element.sendKeys(txt);
	}
	public static void clickBtn(WebElement btn)
	{
		btn.click();
	}
	
}

package org.adactin.execution;

import org.adactin.base.*;
import org.adactin.execution.*;
import org.adactin.pojo.AdactinLocator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class AdactinExection extends Base{
    
	@Test
	public void test1()
	{
		
		WebDriver d=launchBrowser();
		
		launchUrl("https://adactinhotelapp.com/");
		
		AdactinLocator a=new AdactinLocator();
	    fill(a.getTxtEmail(),"balaji123");
	    fill(a.getTxtpass(),"Ladiesman@1");
	    btnClick(a.getBtnClick());
	}
	
	
}

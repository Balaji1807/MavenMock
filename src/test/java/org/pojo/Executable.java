package org.pojo;

import org.openqa.selenium.WebDriver;

public class Executable  extends Base{
	
	public static void main(String[] args) {
		
		WebDriver d= launchBrowser();
		
		launchUrl("https://www.facebook.com");
		
		PojoLocator p=new PojoLocator();
		
		fill(p.getTxtEmail(),"balaji");
		
		fill(p.getTxtPass(),"bala");
		
		btnClick(p.getBtnLogin());
		
		
	}

}

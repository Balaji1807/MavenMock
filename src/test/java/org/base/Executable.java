package org.base;


import org.openqa.selenium.WebDriver;

public class Executable extends Base {
	public static void main(String[] args) {
		
	WebDriver d=null;
	
	launchBrowser();
	
	launchUrl("https://www.facebook.com/");
	
	Pojo p=new Pojo();
			
	data(p.getEmailField(),"balaji");
	
	
	data(p.getPassField(),"bala@123");
	
	
	press(p.getBtnLogin());

}
}

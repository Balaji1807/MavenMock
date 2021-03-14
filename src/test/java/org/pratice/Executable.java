package org.pratice;

import org.openqa.selenium.WebDriver;

public class Executable extends Base{

	public static void main(String[] args) {
		
		WebDriver d=launchBrowser();
		
		launchUrl("https:www.facebook.com/");
		
		windowMax();
		
		Pojo p=new Pojo();
		
		data(p.getTxtEmail(),"balaji");
		data(p.getTxtPass(),"12334");
		clickBtn(p.getBtnClick());
		

	}

}

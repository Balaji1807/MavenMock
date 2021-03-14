package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Base {
	
	public Pojo() {
	  PageFactory.initElements(d, this);	
	}

	@FindBy(id="email")
	private WebElement emailField;
	
	@FindBy(id="pass")
	private WebElement passField;
	
	@FindBy(name="login")
	private WebElement btnLogin;

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPassField() {
		return passField;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}

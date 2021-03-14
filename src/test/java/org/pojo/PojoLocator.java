package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoLocator extends Base {
	
	public PojoLocator() {
	PageFactory.initElements(d,this);
	}
	
	@FindBy(id="email")
	private WebElement txtEmail;

	@FindBy(id="pass")
	private WebElement txtPass;
	
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	@FindBy(name="login")
	private WebElement btnLogin;

}

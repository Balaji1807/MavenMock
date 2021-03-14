package org.adactin.pojo;


import org.adactin.base.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AdactinLocator extends Base {
	
	public AdactinLocator() {
	   	PageFactory.initElements(d,this);
	}
	
	@FindBy(id="username")
	private WebElement txtEmail;

	@FindBy(id="password")
	private WebElement txtpass;

	@FindBy(id="login")
	private WebElement btnClick ;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

}

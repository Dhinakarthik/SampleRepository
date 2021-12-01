package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class FbLoginPagePojo extends BaseClass {
	
	public FbLoginPagePojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBys({
		@FindBy(id="email"),
		@FindBy(xpath="//input[@type='text']")
	})
	private WebElement txtUser;
	
	@FindBys({
		@FindBy(id="pass"),
		@FindBy(xpath="//input[@type='password']")
	})
	private WebElement txtPass;
	
	@FindBys({
		@FindBy(name="login"),
		@FindBy(xpath="//button[@type='submit']")
	})
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	

}

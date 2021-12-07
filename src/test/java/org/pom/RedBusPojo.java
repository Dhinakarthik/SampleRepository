package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class RedBusPojo extends BaseClass{
	
	public RedBusPojo() {
		PageFactory.initElements(driver, this);
	} 
	
	@FindBys({
		@FindBy(id="signin-block"),
		@FindBy(xpath="//div[@class='fr signin-block']")
	})
	private WebElement signinclkBtn;
	
	@FindBy(xpath="//li[text()='Sign In/Sign Up']")
	private WebElement signinhideclkBtn;

	public WebElement getSigninclkBtn() {
		return signinclkBtn;
	}

	public WebElement getSigninhideclkBtn() {
		return signinhideclkBtn;
	}

}

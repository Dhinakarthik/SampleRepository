package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class GreensPojo  extends BaseClass{
	
	public GreensPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//p[@style='text-align:justify; font-size:18px;'])[5]")
    private	WebElement lastLinepara;

	@FindBy(xpath="//h1[@style='font-size:22px;']")
	private WebElement frtLine;

	public WebElement getLastLinepara() {
		return lastLinepara;
	}

	public WebElement getFrtLine() {
		return frtLine;
	}
	
	
}

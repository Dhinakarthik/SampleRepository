package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class DemoQaRegisterPagePojo extends BaseClass {
	
	public DemoQaRegisterPagePojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	private WebElement frtName;
	
	private WebElement lastName;
	
	private WebElement email;
	
	private WebElement mblNo;
	
	private WebElement country;
	
	private WebElement city;
	
	private WebElement message;

}

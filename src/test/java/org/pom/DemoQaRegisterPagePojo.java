package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class DemoQaRegisterPagePojo extends BaseClass {
	
	public DemoQaRegisterPagePojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBys({
		@FindBy(name="firstName"),
		@FindBy(xpath="(//input[@type='text'])[3]")
	})
	private WebElement frtName;
	
	@FindBys({
		@FindBy(id="last-name"),
		@FindBy(xpath="(//input[@type='text'])[4]")
	})
	private WebElement lastName;
	
	@FindBys({
		@FindBy(id="email"),
		@FindBy(xpath="//input[@type='email']")
	})
	private WebElement email;
	
	@FindBys({
		@FindBy(id="mobile"),
		@FindBy(xpath="(//input[@type='text'])[5]")
	})
	private WebElement mblNo;
    
	@FindBys({
		@FindBy(tagName="select"),
		@FindBy(xpath="//select[@class='upcoming__registration--input']")
	})
	private WebElement country;
	
	@FindBys({
		@FindBy(name="city"),
		@FindBy(xpath="(//input[@type='text'])[6]")
	})
	private WebElement city;
	
	@FindBys({
		@FindBy(name="message"),
		@FindBy(xpath="//textarea[@class='upcoming__registration--input']")
	})
	private WebElement message;

	public WebElement getFrtName() {
		return frtName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMblNo() {
		return mblNo;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getMessage() {
		return message;
	}

}

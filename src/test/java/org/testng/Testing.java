package org.testng;

import java.util.Date;

import org.pom.FbLoginPagePojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class Testing extends BaseClass {

	@BeforeClass
	public void launchingChrome() {

		launchChrome();
		launchUrl("https://www.facebook.com");
		max();

	}

	@AfterClass
	public void closingChrome() {

		//closeChrome();

	}

	@BeforeMethod
	public void startTime() {

		System.out.println(new Date());

	}

	@AfterMethod
	public void endTime() {

		System.out.println(new Date());

	}

	@Test(dataProvider = "CollectionData",dataProviderClass=CollectionData.class)
	public void tcs1(String s1, String s2) throws InterruptedException {
		launchUrl("https://www.facebook.com");
		FbLoginPagePojo f = new FbLoginPagePojo();
		passValue(f.getTxtUser(), s1);
		passValue(f.getTxtPass(), s2);
		btnClick(f.getBtnLogin());
		Thread.sleep(2000);

	}


}

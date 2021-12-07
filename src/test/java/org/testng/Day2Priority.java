package org.testng;

import java.util.Date;

import org.pom.FbLoginPagePojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class Day2Priority extends BaseClass {
	
	public static FbLoginPagePojo f;

	@BeforeClass
	public void launchingChrome() {

		launchChrome();
		max();

	}

	@AfterClass
	public void closeingChrome() {

		closeChrome();
	}

	@BeforeMethod
	public void startTime() {

		System.out.println(new Date());

	}

	@AfterMethod
	public void endTime() {

		System.out.println(new Date());

	}

	@Test(enabled = false)
	public void tcs3() {
		f = new FbLoginPagePojo();

		btnClick(f.getBtnLogin());

	}

//	@Test(priority = 3)
//
//	public void tcs1() {
//
//	    f = new FbLoginPagePojo();
//
//		passValue(f.getTxtUser(), "Dhinakaran");
//
//	}
//
//	@Test(priority = -13)
//	public void tcs2() {
//
//	    f = new FbLoginPagePojo();
//
//		passValue(f.getTxtPass(), "Dhina!123");
//
//	}

	 @Test (invocationCount = 5)
	 private void tcs1() throws InterruptedException {
	
	 launchUrl("https://www.facebook.com");
	
	 f = new FbLoginPagePojo();
	
	
	 passValue(f.getTxtUser(), "Dhinakaran");
	
	 passValue(f.getTxtPass(), "Dhina!123");
	
	 btnClick(f.getBtnLogin());
	
	 Thread.sleep(2000);
	
	
	 }

}

package org.junittasktesting;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pom.DemoQaRegisterPagePojo;
import org.pom.FbLoginPagePojo;
import org.pom.Flipkartloginpage;
import org.pom.RedBusPojo;
import org.utilities.BaseClass;

public class Fbloginjunit extends BaseClass {
	public static DemoQaRegisterPagePojo d;

	@BeforeClass
	public static void launchingUrl() {

		launchChrome();
		max();

	}

	@Before
	public void faceBooklog() {
		launchUrl("https://www.flipkart.com/account/login");
	}

	@AfterClass
	public static void message() {

		System.out.println("Successfully enter email an d password in flipkart");
    
	}
	@After
	public void closeUrl() {
		
		closeChrome();
	

	}
	

	@Test
	public void testCase() throws InterruptedException, IOException {
		
		Flipkartloginpage f = new Flipkartloginpage();
		
		passValue(f.getEmail(), "Dhinakaran");
		passValue(f.getPassword(), "9994063012");
		btnClick(f.getLogin());
		
		 


	}

}

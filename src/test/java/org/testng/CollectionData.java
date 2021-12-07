package org.testng;

import org.testng.annotations.DataProvider;

public class CollectionData {
	@DataProvider(name = "CollectionData")
	private Object[][] getData() {

		return new Object[][] {

				{ "Karthi", "Karthi@123" }, { "Hariharan", "Karthi@123" }, { "Yuvakumar", "karthi@123" },
				{ "Yuvaraj", "karthi@123" }

		};

	}

}

//Step 1
package org.testing;


import org.junit.Ignore;
import org.junit.Test;

public class Junit {

	@Test
	public void tc3() {
		System.out.println("Test 3");

	}

	@Test
	public void tc1() {
		System.out.println("Test 1");

	}
    @Ignore
	@Test
	public void tc2() {
		System.out.println("Test 2");

	}

	@Test
	public void tc4() {
		System.out.println("Test 4");

	}
}

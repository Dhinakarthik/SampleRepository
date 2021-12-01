//Step 3
package org.testing;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitRunnerClass {
	@Test
	public void tc55() {
		Result rs = JUnitCore.runClasses(Junit.class, Sampletest.class);

		System.out.println("Run Count : " + rs.getRunCount());

		System.out.println("Failure Count : " + rs.getFailureCount());

		System.out.println("Ignore Count : " + rs.getIgnoreCount());

		System.out.println("Run Time : " + rs.getRunTime());

		List<Failure> fail = rs.getFailures();

		for (Failure eachFail : fail) {
			System.out.println(eachFail);

		}

	}

}

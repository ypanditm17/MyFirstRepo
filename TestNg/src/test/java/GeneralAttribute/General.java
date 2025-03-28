package GeneralAttribute;

import org.testng.annotations.Test;

@Test(singleThreaded = true)
public class General {
	// Test with timeout (Fails if execution exceeds 2 seconds)
	@Test(timeOut = 2000)
	public void testWithTimeout() throws InterruptedException {
		Thread.sleep(1000); // Simulating delay within timeout
		System.out.println("Test executed within timeout");
	}

	// Test with expected exception (Passes if ArithmeticException occurs)
	@Test(expectedExceptions = ArithmeticException.class)
	public void testWithExpectedException() {
		int result = 1 / 0; // This will cause ArithmeticException
		System.out.println("This should not print");
	}

	// Disabled test (Will be ignored)
	@Test(enabled = false)
	public void disabledTest() {
		System.out.println("This test is disabled and will not run");
	}

	// Test with invocation count (Runs 3 times)
	@Test(invocationCount = 3)
	public void testWithInvocationCount() {
		System.out.println("This test runs multiple times");
	}

	// Test with invocation timeout (Fails if all 3 executions exceed 3 seconds)
	@Test(invocationCount = 3, invocationTimeOut = 3000)
	public void testWithInvocationTimeout() throws InterruptedException {
		Thread.sleep(500); // Each run takes 500ms, total is 1500ms (Within limit)
		System.out.println("This test runs multiple times within the timeout");
	}

}

package Parallel_Suite;

import org.testng.annotations.Test;

public class SuiteTest1 {
	@Test
	public void suiteTestA() {
		System.out.println("suiteTestA executed on: " + Thread.currentThread().getId());
	}

	@Test
	public void suiteTestB() {
		System.out.println("suiteTestB executed on: " + Thread.currentThread().getId());
	}

	@Test
	public void suiteTestC() {
		System.out.println("suiteTestC executed on: " + Thread.currentThread().getId());
	}

}

package Parallel_Suite;

import org.testng.annotations.Test;

public class SuiteTest2 {
	@Test
	public void suiteTestD() {
		System.out.println("suiteTestD executed on: " + Thread.currentThread().getId());
	}

	@Test
	public void suiteTestE() {
		System.out.println("suiteTestE executed on: " + Thread.currentThread().getId());
	}

	@Test
	public void suiteTestF() {
		System.out.println("suiteTestF executed on: " + Thread.currentThread().getId());
	}
}

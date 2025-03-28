package Parallel_Method;

import org.testng.annotations.Test;

public class ParallelTestMethod2 {
	@Test
	public void testMethod4() {
		System.out.println("Executing testMethod4 on " + Thread.currentThread().getId());
	}

	@Test
	public void testMethod5() {
		System.out.println("Executing testMethod5 on " + Thread.currentThread().getId());
	}

	@Test
	public void testMethod6() {
		System.out.println("Executing testMethod6 on " + Thread.currentThread().getId());
	}

}

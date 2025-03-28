package Parallel_Method;

import org.testng.annotations.Test;

public class ParallelTestMethod1 {
	@Test
	public void testMethod1() {
		System.out.println("Executing testMethod1 on " + Thread.currentThread().getId());
	}

	@Test
	public void testMethod2() {
		System.out.println("Executing testMethod2 on " + Thread.currentThread().getId());
	}

	@Test
	public void testMethod3() {
		System.out.println("Executing testMethod3 on " + Thread.currentThread().getId());
	}

}

package Parallel_Class;

import org.testng.annotations.Test;

public class ClassTest1 {
	@Test
	public void testA() {
		System.out.println("ClassTest1 - testA executed on: " + Thread.currentThread().getId());
	}

	@Test
	public void testB() {
		System.out.println("ClassTest1 - testA executed on: " + Thread.currentThread().getId());
	}

	@Test
	public void testC() {
		System.out.println("ClassTest1 - testA executed on: " + Thread.currentThread().getId());
	}

}

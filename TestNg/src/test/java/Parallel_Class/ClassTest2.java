package Parallel_Class;

import org.testng.annotations.Test;

public class ClassTest2 {

	@Test
	public void testE() {
		System.out.println("ClassTest1 - testA executed on: " + Thread.currentThread().getId());
	}

	@Test
	public void testF() {
		System.out.println("ClassTest1 - testA executed on: " + Thread.currentThread().getId());
	}

	@Test
	public void testG() {
		System.out.println("ClassTest1 - testA executed on: " + Thread.currentThread().getId());
	}

}

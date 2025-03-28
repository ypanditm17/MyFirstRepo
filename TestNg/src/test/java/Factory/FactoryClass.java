package Factory;

import org.testng.annotations.Test;

public class FactoryClass {
	private int a;
	private int b;

	public FactoryClass(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Test
	public void sumOfFactory() {
		int result = a + b;
		System.out.println("The sum of no  is" + a + "and" + b + "is :-" + result);
	}

}

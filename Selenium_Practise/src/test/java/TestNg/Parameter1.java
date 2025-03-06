package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
	@Test
	@Parameters({ "value1", "value2" })
	public void Minus(int val1, int val2) {
		int result = val1 - val2;
		System.out.println(result);
	}

	@Test
	@Parameters({"value1", "value2"})
	public void sum(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}

}

package Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MathOperations1 {
	@Test
	@Parameters({ "num1", "num2" })
	public void sum1(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	@Test
	@Parameters({ "num3", "num4" })
	public void minus1(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

}

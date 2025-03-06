package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Test
	@Parameters({ "val1", "val2" })
	public void plus(int v1, int v2) {
		System.out.println("Hello world");
		int result = v1 + v2;
		System.out.println(result);
	}

}

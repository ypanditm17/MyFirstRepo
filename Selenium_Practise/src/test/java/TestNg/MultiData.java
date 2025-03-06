package TestNg;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiData {
	@DataProvider(name = "Data")
	public Object[][] so() {
		return new Object[][] { { 2, 2, 4 }, { 4, 5, 6 }, { 4, 4, 8 } };
	}

	@Test(dataProvider = "Data")
	public void plus(int a, int b, int c) {
		c = a + b;
		System.out.println(c);
		// Assert.assertEquals(sum, c);
	}

}

package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	@Test(dataProvider = "data", priority = 1)

	public void sum(int a, int b) {
		int c = a + b;
		System.out.println(c);

	}

	@Test(dataProvider = "data", priority = 2)
	public void minus(int a, int b) {
		int c = a - b;
		System.out.println(c);

	}

	@DataProvider(name = "data")
	public Object[][] data() {
		return new Object[][] { { 10, 20 }, { 30, 40 },

		};

	}

	@DataProvider(name = "data1")
	public Object[][] data1() {
		return new Object[][] { { 50, 50 }, { 60, 60 },

		};
	}

}

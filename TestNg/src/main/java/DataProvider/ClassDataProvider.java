package DataProvider;

import org.testng.annotations.Test;

public class ClassDataProvider {
	@Test(dataProviderClass = DataProvider1.class, dataProvider = "data1")
	public void multiply(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}

}

package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataInherited {
	@Test(dataProvider = "data-provider", dataProviderClass = DataProvider.class)
	public void launch(String str) {
		System.out.println(str);
	}

}

package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

    @Test(dataProvider = "data-provider")
    public void data(String str) {
        System.out.println("The value passed: " + str);
    }

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][] { { "First" }, { "Second" }, { "Third" } };
    }
}
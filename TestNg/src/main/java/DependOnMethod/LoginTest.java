package DependOnMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void login() {
		System.out.println("🔹 Login Successful");
		Assert.fail("maually failed the test case");

	}

	@Test(dependsOnMethods = "login", alwaysRun = true)
	public void dashboard() {
		System.out.println("🔹 Dashboard Loaded");

	}

	@Test
	public void category() {
		System.out.println("Category Loaded");
	}

}

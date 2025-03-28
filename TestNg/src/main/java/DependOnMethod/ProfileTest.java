package DependOnMethod;

import org.testng.annotations.Test;

public class ProfileTest {
	@Test(dependsOnMethods = "DependOnMethod.LoginTest.login", alwaysRun = true)
	public void updateProfile() {
		System.out.println("🔹 Profile Updated");
		// Only runs if login() from LoginTest succeeds
	}

	@Test(dependsOnMethods = "updateProfile")
	public void logout() {
		System.out.println("🔹 Logout Successful");
		// Runs only after updateProfile() is completed
	}

}

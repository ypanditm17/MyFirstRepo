package GroupAndDependsOnGroup;

import org.testng.annotations.Test;

public class UserTests {
	@Test(groups = "sanity")
	public void createUser() {
		System.out.println("🔹 User Created (Sanity)");
	}

	@Test(groups = "smoke", dependsOnGroups = "sanity")
	public void editUser() {
		System.out.println("🔹 User Edited (Smoke - Depends on Sanity)");
	}

	@Test(groups = "regression", dependsOnGroups = "smoke")
	public void deleteUser() {
		System.out.println("🔹 User Deleted (Regression - Depends on Smoke)");
	}

	@Test(groups = "regression", dependsOnGroups = "smoke")
	public void viewUser() {
		System.out.println("🔹 View User Details (Regression - Depends on Smoke)");
	}
}

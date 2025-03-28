package GroupAndDependsOnGroup;

import org.testng.annotations.Test;

public class TransactionTests {
	@Test(groups = "sanity")
	public void initTransaction() {
		System.out.println("🔹 Transaction Initialized (Sanity)");
	}

	@Test(groups = "smoke", dependsOnGroups = { "sanity" })
	public void processTransaction() {
		System.out.println("🔹 Transaction Processed (Smoke - Depends on Sanity)");
	}

	@Test(groups = "regression", dependsOnGroups = "smoke")
	public void verifyTransaction() {
		System.out.println("🔹 Transaction Verified (Regression - Depends on Smoke)");
	}

	@Test(groups = "regression", dependsOnGroups = { "smoke", "sanity" })
	public void cancelTransaction() {
		System.out.println("🔹 Transaction Canceled (Regression - Depends on Smoke)");
	}
}

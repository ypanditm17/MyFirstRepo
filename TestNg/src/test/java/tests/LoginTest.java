package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utils.BaseClass;

@Listeners(Utils.TestListener.class)
public class LoginTest extends BaseClass {

	@BeforeMethod
	public void setUpTest() {
		setup(); // Launch Browser
	}

	@Test
	public void loginTest() {
		driver.get("https://www.facebook.com/");
		System.out.println("Navigated to login page");
	}

	@AfterMethod
	public void tearDownTest() {
		teardown(); // Close Browser
	}
}

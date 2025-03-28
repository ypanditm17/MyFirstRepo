package SeleniumAdvance;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	private static ExtentReports report;
	private static ExtentTest test;

	public static void main(String[] args) {
		// Setup Extent Reports
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/ExtentReport.html");
		report = new ExtentReports();
		report.attachReporter(sparkReporter);

		// Creating a Test Case in Report
		test = report.createTest("Login Test Case");
		test.info("Test Started");

		// Logging Steps
		test.pass("Step 1: Opened browser successfully");
		test.pass("Step 2: Navigated to login page");
		test.pass("Step 3: Entered valid credentials");
		test.pass("Step 4: Clicked on login button");
		test.pass("Step 5: Login successful");

		// Generate Report (important!)
		report.flush();

		System.out.println("🚀 Extent Report Generated: Open 'ExtentReport.html'");
	}

}

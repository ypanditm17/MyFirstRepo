package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	public static ExtentReports extent;
	public static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	public static void setUpExtentReport() {
		ExtentSparkReporter report = new ExtentSparkReporter("./extent-reports/extent.html");
		extent = new ExtentReports();

	}

	public static void createTest(String testName, String group, String author) {
		ExtentTest extentTest = extent.createTest(testName).assignCategory(group).assignAuthor(author)
				.assignDevice("Chrome");
		test.set(extentTest);
	}

	public static ExtentTest getTest() {
		return test.get();

	}

	public static ExtentReports getReport() {
		return extent;
	}

	public static void flushReport() {
		extent.flush();
	}

}

package Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	private static ExtentReports extent;

	public static ExtentReports getReportInstance() {
		if (extent == null) {
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);
		}
		return extent;
	}

	// Flush method to write test info to the report
	public static void flushReport() {
		if (extent != null) {
			extent.flush();
		}
	}
}

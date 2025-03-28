package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListener implements ITestListener {
    private static final Logger logger = LogManager.getLogger(TestListener.class);

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("Test Failed: " + result.getName());
        Reporter.log("Test Failed: " + result.getName());

        // Capture Screenshot on Failure
        WebDriver driver = BaseClass.getDriver();
        if (driver != null) {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String screenshotPath = "test-output/screenshots/" + result.getName() + ".png";
            try {
                FileUtils.copyFile(screenshot, new File(screenshotPath));
                Reporter.log("<br><img src='" + screenshotPath + "' height='300' width='500'/><br>");
                logger.info("Screenshot saved at: " + screenshotPath);
            } catch (IOException e) {
                logger.error("Failed to save screenshot: " + e.getMessage());
            }
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("Test Passed: " + result.getName());
    }

}

package Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected static WebDriver driver;
	private static final Logger logger = LogManager.getLogger(BaseClass.class);

	public void setup() {
		logger.info("Launching Chrome browser...");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		logger.info("Browser launched successfully.");
	}

	public void teardown() {
		if (driver != null) {
			logger.info("Closing browser...");
			driver.quit();
			logger.info("Browser closed.");
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

}

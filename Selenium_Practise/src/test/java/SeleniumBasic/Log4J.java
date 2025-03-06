package SeleniumBasic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4J {
	public WebDriver driver;
	public static Logger logger = LogManager.getLogger(Log4J.class);
@Test
	public void launch() throws IOException {
		logger.info("Chrome is initialise");
		driver = new ChromeDriver();
		logger.info("URl is getting open");
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		logger.info("Window getting maximise");
		driver.manage().window().maximize();

		logger.info("Screen shot method getting involve");
		TakesScreenshot shot = (TakesScreenshot) driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		logger.info("screenshot getting save in file");
		FileUtils.copyFile(source, new File("./Screenshots/Image1.png"));
		logger.info("chorme getting close");
		driver.quit();

	}

}

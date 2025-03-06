package SeleniumBasic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot1 {
	public WebDriver driver;

	@Test(priority = 1)
	public void Screenshot() throws IOException, InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();

		TakesScreenshot shot = (TakesScreenshot) driver;
		File source = shot.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, new File("./Screenshots/Image1.png"));
		// driver.quit();
		Thread.sleep(100);
	}

	@Test(priority = 2)
	public void captureWebelement() throws IOException {
		WebElement images1 = driver.findElement(By.xpath("//img[@id='Header1_headerimg']"));
		File file = images1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/Image2.png"));
	}

}

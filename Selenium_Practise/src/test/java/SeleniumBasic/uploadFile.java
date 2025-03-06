package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class uploadFile {
	public WebDriver driver;

	@Test(priority = 1)
	public void uploadFile() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		WebElement load = driver.findElement(By.xpath("//input[@id='fileupload1']"));
		//Actions act = new Actions(driver);
		//act.moveToElement(load).perform();
		Thread.sleep(1000);
		load.sendKeys("C:\\Users\\welcome\\Downloads.jpg");
		driver.close();
	}
}

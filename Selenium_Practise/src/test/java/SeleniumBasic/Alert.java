package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
	public WebDriver driver;

	@Test(priority = 1)
	public void handleAlert() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get(
				"https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html#google_vignette");

		WebElement simpleAlert = driver.findElement(By.xpath("//button[@id='simpleAlert']"));
		simpleAlert.click();
		driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(200);
		driver.switchTo().alert().accept();

		Thread.sleep(200);

		WebElement conf = driver.findElement(By.xpath("//button[@id='confirmationAlert']"));
		conf.click();
		driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(200);
		driver.switchTo().alert().dismiss();

		Thread.sleep(200);

		WebElement prompt = driver.findElement(By.xpath("//button[@id='promptAlert']"));
		prompt.click();
		Thread.sleep(200);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("yogesh");
		Thread.sleep(200);
		driver.switchTo().alert().accept();

	}

}

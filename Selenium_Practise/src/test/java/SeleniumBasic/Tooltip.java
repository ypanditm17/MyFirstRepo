package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tooltip {
	public WebDriver driver;

	@Test(priority = 1)
	public void tool() {
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/");
		WebElement tool1 = driver.findElement(By.xpath("//input[@name='q']"));
		String tip = tool1.getAttribute("title");
		System.out.println("The title of tooltip is :" + tip);
		driver.close();
	}
	
	

}

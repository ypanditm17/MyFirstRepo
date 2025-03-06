package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Deselectclass {
	public WebDriver driver;

	@Test(priority = 1)
	public void Launch() {
		driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");

	}

	@Test(priority = 2)
	public void deselect() throws InterruptedException {
		WebElement mySelectElement = driver.findElement(By.name("multipleselect[]"));
		Select sel1 = new Select(mySelectElement);
		sel1.selectByVisibleText("Manual Testing");
		Thread.sleep(1000);
		sel1.deselectByVisibleText("Manual Testing");
	}

}

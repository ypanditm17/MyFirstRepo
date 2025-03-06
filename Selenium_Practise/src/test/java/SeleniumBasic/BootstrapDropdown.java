package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDropdown {
	public WebDriver driver;

	@Test(priority = 1)
	public void launch() {
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");

	}

	@Test(priority = 2)
	public void select() throws InterruptedException {
		List<WebElement> option = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));

		for (WebElement opt : option) {
			String opt1 = opt.getText();
			if (opt1.equalsIgnoreCase("contact us")) {
				Thread.sleep(1000);
				System.out.println("ption select");
				opt.click();
				System.out.println("plz check");
				break;
			}

		}
	}

}

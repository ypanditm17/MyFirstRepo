package SeleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox_RadioButton {
	public WebDriver driver;

	@Test(priority = 1)
	public void launch() {
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	}

	@Test(priority = 2)
	public void clickradioButton() {
		WebElement rad1 = driver.findElement(By.xpath("//input[@value='Female']"));
		if (rad1.isDisplayed()) {
			System.out.println("Radio button is displayed.");

			if (rad1.isEnabled()) {
				System.out.println("Radio button is enabled.");

				if (rad1.isSelected()) {
					System.out.println("Radio button is already selected.");
				} else {
					System.out.println("Radio button is not selected.");
					// You can select it if needed
					rad1.click();
					System.out.println("Radio button is now selected.");
				}
			} else {
				System.out.println("Radio button is disabled.");
			}
		} else {
			System.out.println("Radio button is not displayed.");
		}
	}

	@Test(priority = 3)
	public void ChecBox() {
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[contains(@value, 'ing')]"));
		for (WebElement checkbxes : checkbox) {
			if (!checkbxes.isSelected()) {
				checkbxes.click();
				System.out.println(checkbxes.getAttribute("value"));
			}

		}
	}

	@Test(priority = 4)
	public void selectBox() throws InterruptedException {
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[contains(@value, 'ing')]"));
		for (int i = 0; i < checkbox.size(); i++) {
			WebElement check = checkbox.get(i);
			String checks = check.getAttribute("value");

			if (checks.contains("Dancing")) {
				Thread.sleep(1000);
				if (check.isSelected()) {
					Thread.sleep(1000);
					check.click();
					System.out.println("Checkbox is selected");
				} else {
					System.out.println("Checkbox is not selected");
				}
				break;
			}

		}
	}
}

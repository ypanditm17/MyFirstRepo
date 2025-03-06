package SeleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectClass {
	public WebDriver driver;

	@Test(priority = 1)
	public void Launch() {
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	}

	@Test(priority = 2)
	public void selectDate() {
		WebElement date = driver.findElement(By.id("Birthday_Day"));
		Select sel1 = new Select(date);
		sel1.selectByIndex(1);
		WebElement opt1 = sel1.getFirstSelectedOption();
		System.out.println("select option from dropdown" + opt1.getText());
	}

	@Test(priority = 3)
	public void selectMonth() throws InterruptedException {
		WebElement month = driver.findElement(By.xpath("//select[@id='Birthday_Month']"));
		Select sel = new Select(month);
		Thread.sleep(1000);
		sel.selectByValue("November");
		WebElement opt1 = sel.getFirstSelectedOption();
		System.out.println("select option from dropdown" + opt1.getText());
		// WebElement month1 =
		// driver.findElement(By.xpath("//select[@id='Birthday_Month']"));
		List<WebElement> months = sel.getOptions();
		System.out.println(months.size());
		for (WebElement list : months) {
			System.out.println(list.getText());

		}

	}

	@Test(priority = 4)
	public void selectYear() throws InterruptedException {
		WebElement year = driver.findElement(By.xpath("//select[@id='Birthday_Year']"));
		Select sel = new Select(year);
		Thread.sleep(1000);
		sel.selectByValue("1990");
		WebElement opt1 = sel.getFirstSelectedOption();
		System.out.println("select option from dropdown" + opt1.getText());
		List<WebElement> list = sel.getOptions();
		System.out.println(list.size());
		for (WebElement lists : list) {
			System.out.println(lists.getText());

		}

	}

}

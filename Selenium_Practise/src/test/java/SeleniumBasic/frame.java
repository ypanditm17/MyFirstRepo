package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class frame {
	public WebDriver driver;

	@Test
	public void frameHandle() {
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frm1']"));

		driver.switchTo().frame(frame1);
		Select sel = new Select(driver.findElement(By.id("course")));
		sel.selectByVisibleText("Java");

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello JAVA");

	}

}

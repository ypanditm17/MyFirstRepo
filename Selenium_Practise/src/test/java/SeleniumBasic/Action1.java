package SeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action1 {
	public WebDriver driver;

	@Test(priority = 1)
	public void launch() {
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	}

	@Test(priority = 2)
	public void operation() {
		WebElement doub = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions act = new Actions(driver);
		act.doubleClick(doub).build().perform();
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	@Test(priority = 3)
	public void action1() {
		WebElement right = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		Actions act = new Actions(driver);
		act.contextClick(right).build().perform();
	}

}

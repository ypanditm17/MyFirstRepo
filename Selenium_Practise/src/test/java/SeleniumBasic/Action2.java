package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action2 {
	public WebDriver driver;

	@Test(priority = 1)
	public void launch() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
	}

	@Test(priority = 2)
	public void dragDrop() {
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement to = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		WebElement check = driver.findElement(By.xpath("//div[@id='draggable']"));
		if (check.isDisplayed()) {
			System.out.println("successfully drop to another drop");

		} else {
			System.out.println("failed to drop");
		}
	}

}

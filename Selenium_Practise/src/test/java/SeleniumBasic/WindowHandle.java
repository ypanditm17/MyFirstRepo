package SeleniumBasic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {
	public WebDriver driver;

	@Test
	public void handlewindow() {
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		String parentHandle = driver.getWindowHandle();
		System.out.println("parent window" + parentHandle);

		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		for (String handle : windowhandles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				String title = driver.getTitle();
				System.out.println(title);
				driver.close();

			}
		}
		driver.switchTo().window(parentHandle);
		String parent = driver.getTitle();
		System.out.println(parent);
		driver.quit();
	}

}

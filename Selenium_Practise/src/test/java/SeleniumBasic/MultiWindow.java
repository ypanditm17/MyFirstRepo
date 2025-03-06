package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MultiWindow {
	public static void main(String[] args) {
		// Set up WebDriver (update the path to your ChromeDriver)
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		WebDriver driver = new ChromeDriver();

		try {
			// Open the parent window
			driver.get("https://demoqa.com/browser-windows");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();

			// Store the parent window handle
			String parentWindow = driver.getWindowHandle();
			System.out.println("Parent Window Handle: " + parentWindow);

			// Open Child 1
			WebElement child1Button = driver.findElement(By.id("tabButton")); // Button to open first child
			child1Button.click();

			// Open Child 2
			WebElement child2Button = driver.findElement(By.id("windowButton")); // Button to open second child
			child2Button.click();

			// Get all window handles
			Set<String> allWindowHandles = driver.getWindowHandles();
			List<String> windowHandlesList = new ArrayList<>(allWindowHandles);

			// Print the title of each window
			for (String handle : windowHandlesList) {
				driver.switchTo().window(handle);
				System.out.println("Window Handle: " + handle + " | Title: " + driver.getTitle());
			}

			// Switch to Child 2
			driver.switchTo().window(windowHandlesList.get(2));
			System.out.println("Switched to Child 2 | Title: " + driver.getTitle());

			// Switch to Child 1
			driver.switchTo().window(windowHandlesList.get(1));
			System.out.println("Switched to Child 1 | Title: " + driver.getTitle());

			// Switch back to Parent
			driver.switchTo().window(parentWindow);
			System.out.println("Switched back to Parent | Title: " + driver.getTitle());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close all browser windows and end the session
			driver.quit();
		}
	}
}

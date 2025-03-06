package SeleniumBasic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLink {
	public WebDriver driver;

	@Test
	public void checkLink() throws MalformedURLException, IOException {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Size of link" + link.size());

		for (WebElement links : link) {
			String url = links.getAttribute("href");

			// Skip null or empty URLs
			if (url == null || url.isEmpty()) {
				System.out.println("Link is empty or null");
				continue;
			}

			try {
				HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
				connection.setRequestMethod("HEAD");
				connection.setConnectTimeout(5000); // 5 seconds timeout
				connection.connect();

				int responseCode = connection.getResponseCode();
				if (responseCode >= 400) {
					System.out.println("Broken URL: " + url + " (Response code: " + responseCode + ")");
				} else {
					System.out.println("Working URL: " + url + " (Response code: " + responseCode + ")");
				}

				connection.disconnect();
			} catch (Exception e) {
				System.out.println("Error with URL: " + url + " (" + e.getMessage() + ")");
			}
		}
	}

}

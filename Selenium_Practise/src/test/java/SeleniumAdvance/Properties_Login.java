package SeleniumAdvance;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Properties_Login {
	Properties prop;

	WebDriver driver;

	@Test
	public void PropertyFileRetrive() {
		prop = new Properties();
		 InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");

	        if (input == null) {
	            System.out.println("Error: config.properties file not found in src/test/resources!");
	            return;
	        }

	        try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String brow = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String name = prop.getProperty("username");
		String password = prop.getProperty("password");

		if ("chrome".equalsIgnoreCase(brow)) {
			driver = new ChromeDriver();

		} else {
			System.out.println("no browser is avaialble");
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();

		WebElement userField = driver.findElement(By.xpath("//input[@id='identity']"));
		userField.sendKeys(name);

		WebElement passwordField = driver.findElement(By.xpath("//input[@id='login-password']"));
		passwordField.sendKeys(password);

		driver.findElement(By.xpath("//button[normalize-space()='anmelden']")).click();

	}

}

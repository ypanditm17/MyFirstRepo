package SeleniumAdvance;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static WebDriver driver;
	static String projectPath;

	public static void main(String[] args) {
		try {
			projectPath = System.getProperty("user.dir");
			System.out.println(projectPath);

			workbook = new XSSFWorkbook(projectPath + File.separator + "Exel" + File.separator + "data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			int rowcount = sheet.getPhysicalNumberOfRows();
			for (int rowNo = 1; rowNo < rowcount; rowNo++) {
				String userName = sheet.getRow(rowNo).getCell(0).getStringCellValue();
				String password = sheet.getRow(rowNo).getCell(1).getStringCellValue();

				System.out.println(userName + " " + password);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userName);
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

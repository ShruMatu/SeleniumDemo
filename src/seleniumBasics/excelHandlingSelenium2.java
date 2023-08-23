package seleniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelHandlingSelenium2 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		File file = new File("F:\\Testing\\testData.xlsx");
		FileInputStream inputstream = new FileInputStream(file);
		XSSFWorkbook filename = new XSSFWorkbook(inputstream);
		Sheet sheet = filename.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		
		WebElement username = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		
		for(int i=0; i<=rowcount; i++)
		{
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			System.out.print(cell+" ");
			username.sendKeys(cell.toString());
			int colnum = row.getLastCellNum();
			for(int j=1; j<colnum; j++)
			{
				cell = row.getCell(j); 
				System.out.print(cell);
				password.sendKeys(cell.toString());
				Thread.sleep(3000);
				username.clear();
				password.clear();
			}
			System.out.println();
		}
			driver.quit();
	}

}

package seleniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelHandingSelenium {

		public static void main(String[] args) throws IOException {
			
			//WebDriver driver = new ChromeDriver();
			//driver.get("https://login.salesforce.com/?locale=in");
			
			//To Launch Crome Browser
	        WebDriver driver = new ChromeDriver();
	        //Open URL
	        driver.get("https://login.salesforce.com/?locale=in");
			
			 //Create an object of File class to open xlsx file
	        File file = new File("F:\\Testing\\testData.xlsx");
	        
	        //Create an object of FileInputStream class to read excel file
	        FileInputStream inputStream = new FileInputStream(file);
	        
	        //create object of XSSFWorkbook class for .xlsx file
	        XSSFWorkbook fileName = new XSSFWorkbook(inputStream);
	        
	        //Read sheet inside the workbook by its name
	        XSSFSheet sheet = fileName.getSheet("Sheet1");
	        
	        //To select the Row
	        Row row = sheet.getRow(4);
	        
	        //To select cell
	        Cell cell = row.getCell(1);
	        
	        //Row row1 = sheet.getRow(2);
	        //To select cell
	        //Cell cell1 = row1.getCell(2);
	        
	        //System.out.println(row);
	        System.out.println(cell);
	        
	        //System.out.println(row1);
	        //System.out.println(cell1);
	        
	        
	        String username=cell.toString();
	        String password=cell.toString();

	        
	        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(username);
	        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
	        //driver.findElement(By.xpath("//input[@id=\"Login\"]")).click();

			
		}
		
	}

package seleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SceenShotinSelenium {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile , new File("E:\\ScreenshotInSelenium\\screenshot1.png"));
		
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		
		File screenshotFile1 = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile1 , new File("E:\\ScreenshotInSelenium\\screenshot2.png"));
	}

}

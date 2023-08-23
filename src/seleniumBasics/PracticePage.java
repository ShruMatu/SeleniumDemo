package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticePage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		//checkbox.click();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement checkbox1 : checkboxes)
		{
			checkbox1.click();
		}
		
		//WebElement radio = driver.findElement(By.xpath("//input[@value='Radio1']"));
		
		/*List<WebElement> radioButton = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement radio : radioButton)
		{
			radio.click();
		}*/
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s = new Select(dropDown);
		s.selectByIndex(1);
		s.selectByValue("option1");
		s.selectByVisibleText("Option1");
	}

}

package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//div[@id='divpaxinfo']
		WebElement DropDown = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		DropDown.click();
		
		WebElement DropDown1 = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select s = new Select(DropDown1);
		Thread.sleep(4000);
		s.selectByVisibleText("INR");
		
		
		/*if(driver.findElements(By.xpath("//div[@id='divpaxOptions']//div") != null))
				{

			   WebElement menuHoverLink = driver.findElement(By.id("//div[@id='divpaxOptions']//div"));
			   DropDown.perform();

			   }
			   else{
			   System.out.println("element not present -- so it entered the else loop");

			}*/
	}

}

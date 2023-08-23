package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
			
		//ID
		//Name
		//XPath
		//ClassName
		//CSS Selector
		//linkText
		//PartialLinktext
		//TagName
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
		//Enter username
		//driver.findElement(By.id("username")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test");
		//Enter Password
		//driver.findElement(By.name("pw")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test");
		//Remember me click
		driver.findElement(By.id("rememberUn")).click();
		//Login Button
		driver.findElement(By.id("Login")).click();
		Thread.sleep(4000);
		//to click on forgot password link
		//driver.findElement(By.id("forgot_password_link")).click();
		//driver.findElement(By.linkText("Forgot Your Password?")).click();
		//driver.findElement(By.partialLinkText("Forgot Your")).click();
		driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		//driver.close();
	}

}

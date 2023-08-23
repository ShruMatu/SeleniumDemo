package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableSelenium {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> amounts = driver.findElements(By.xpath("(//table[@id=\"product\"])[2]//tbody//tr//td[4]"));
		
		int sum=0;
		for(WebElement amount:amounts)
		{
			System.out.println(amount.getText());
			int temp = Integer.parseInt(amount.getText());
			sum = sum + temp;
		}
		System.out.println("Sum is: "+sum);
		
		WebElement totalAmount = driver.findElement(By.xpath("//div[@class=\"totalAmount\"]"));
		System.out.println(totalAmount.getText());
		String onlyTotal = totalAmount.getText().substring(24);
		int total = Integer.parseInt(onlyTotal);
		if(sum==(total))
		{
			System.out.println("Valiated sum data sucessful");
		}
		else
		{
			System.out.println("Invalid data..");
		}
	}

}

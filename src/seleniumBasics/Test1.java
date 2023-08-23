package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		//Launch browser
		//Reference WebDriver  Object ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//Launch URL
	    //driver.get("https://www.gmail.com");
	    driver.get("https://www.amazon.com");
	    
	    System.out.println(driver.getTitle());
	    
	    //to navigate backward
	    driver.navigate().back();
	    
	    //to navigate forward
	    driver.navigate().forward();
	    
	    //to refresh the page
	    driver.navigate().refresh();
	    
	    //to maximize window
	    driver.manage().window().maximize();
	    
	    //to minimize window
	    //driver.manage().window().minimize();
	    
	    driver.get("https://www.gmail.com");
	}

}

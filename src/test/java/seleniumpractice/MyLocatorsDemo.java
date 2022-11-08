package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLocatorsDemo {

	public void locatorsDemoMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement userName=driver.findElement(By.id("email"));
		
		userName.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("pass"));
		
		password.sendKeys("Admin@123");
		
		WebElement loginbtn=driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		
		loginbtn.click();
		
		/*
		 * List<WebElement> listofElements=driver.findElements(By.tagName("a"));
		 * 
		 * for (WebElement webElement : listofElements) { webElement.getText(); }
		 */
		
	}
	
	public static void main(String[] args) {
		MyLocatorsDemo obj1=new MyLocatorsDemo();
		obj1.locatorsDemoMethod();
	}
}

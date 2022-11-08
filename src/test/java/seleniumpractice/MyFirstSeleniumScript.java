package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumScript {

public void launchChromeBrowser() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println(driver.getTitle());
	Thread.sleep(5000);
	//driver.navigate().refresh();
}
public void launchFirefoxDriver() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\SeleniumDrivers\\geckodriver-v0.32.0-win32\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println(driver.getTitle());
	Thread.sleep(5000);
}

public static void main(String[] args) throws InterruptedException {
	MyFirstSeleniumScript obj1=new MyFirstSeleniumScript();
	//obj1.launchChromeBrowser();
	//obj1.launchFirefoxDriver();
	
	
}
}

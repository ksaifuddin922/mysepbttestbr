package seleniumpractice;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(seleniumpractice.MyTestNgListners.class)
public class TestNgDemo {

	WebDriver driver;

	@BeforeMethod
	public void SetUp() {

		System.out.println("This is my Setup method");
	}

	@Test(groups = { "Sanity","Regression","Functional"}, priority = 3)
	public void launchBrowserTest() {

		System.out.println("This is browser launch");

	}

	@Test(priority = 0,groups = { "Sanity","Regression"})

	public void closeMyBrowser() {

		System.out.println("Priority Zero");

	}

	@Test(dependsOnGroups = "Sanity")

	public void closeMyBrowserP2() {

		System.out.println("Priority 1");
		
		
		
		//Assert.assertEquals("Test", "Automation");
		
		//Assert.assertTrue(false);
	}

	@AfterMethod
	public void quitTests() {
		System.out.println("This is my quit");
		System.out.println("This is my quit");
		System.out.println("This is my quit");
	}

}

package seleniumpractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNgListners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("My test is started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("My test is Passed"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("My test is Passed"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("My test is Skipped"+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("My test on Start "+context.getName());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("My test on finsh "+context.getName());
		
	}

}

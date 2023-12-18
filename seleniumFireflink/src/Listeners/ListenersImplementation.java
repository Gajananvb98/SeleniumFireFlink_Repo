package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersImplementation implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Failed to login", true);
	}

}

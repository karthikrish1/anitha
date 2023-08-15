package testnglist;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener=> builtin interface 
	//OnStart, onFinish, OnTestSucess, onTestfailure
	// class<=> interface =>   class definitio=> implements interfacename
 //right click=> source=> override or implement method

public class c1 implements ITestListener{

	public void onTestSuccess(ITestResult result) {
		System.out.println("SUcesss!!!!");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Faileeddd!!!!!");
	}

	public void onStart(ITestContext context) {
		System.out.println("Started!!!!");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Finished!!!!");
	}
	
	
}

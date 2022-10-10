package listneer;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;


public  class Itestlistners implements ITestListener{
	
	public void onTestfailure(ITestResult result) {
		System.out.println("finished");
	}
	
	


}

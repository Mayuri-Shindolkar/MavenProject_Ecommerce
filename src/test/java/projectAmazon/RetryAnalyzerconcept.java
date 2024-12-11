package projectAmazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerconcept implements IRetryAnalyzer
{
	int intialcount=0;
	int retrycount=1;
	@Override
	public boolean retry(ITestResult result)
	{
		if(intialcount<retrycount)
		{
			intialcount++;
			return true;
		}
		
		return false;//false means dont retry
	}

}
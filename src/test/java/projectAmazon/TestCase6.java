package projectAmazon;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class TestCase6 extends Launch_Quit
{
	@Test(retryAnalyzer=projectAmazon.RetryAnalyzerconcept.class)
	public void searchingwithfilters() throws InterruptedException, AWTException
	{
		
		
		Searching_With_Filters s2=new Searching_With_Filters (driver);
		s2.searchingmethod();
		Thread.sleep(2000);
		s2.size1();
		s2.puma1();
		//Thread.sleep(2000);
		//s2.pricerange1();
		//s2.shoe1();
		//s2.womens_shoe1();
		//s2.selecting_shoe1();
		 
		  
	}

}

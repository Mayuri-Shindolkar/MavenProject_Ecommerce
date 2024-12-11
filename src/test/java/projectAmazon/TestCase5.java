package projectAmazon;

import org.testng.annotations.Test;

import projectAmazon.Searching_Product;

public class TestCase5 extends Launch_Quit
{
	@Test(retryAnalyzer=projectAmazon.RetryAnalyzerconcept.class)        //(dataProvider="searching")
	
	public void logintoamazon()
	{
		
		Searching_Product s1=new Searching_Product (driver);
		s1.searchingmethod();
		 
		  
	}
}

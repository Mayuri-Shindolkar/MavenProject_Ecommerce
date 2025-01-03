package projectAmazon;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase3 extends Launch_Quit
{     //invalid Login
	@Test(retryAnalyzer=projectAmazon.RetryAnalyzerconcept.class)  
	public void logintoamazon() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		Ddt_Class d1=new Ddt_Class();
		d1.ddtmethod();
		HomePage h1=new HomePage(driver);
		h1.acandlist(driver);
		h1.signinmethod();
		
		Incorrect_Login l1=new Incorrect_Login(driver);
		l1.emailmethod1();
		l1.continue_button();
		//l1.pwd2();
		//l1.submit_button();
		//Assert.assertEquals(l1.getTitle(),true);
	   // Reporter.log("testcase is pass");
	}

}

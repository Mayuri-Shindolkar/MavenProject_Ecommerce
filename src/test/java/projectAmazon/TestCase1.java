package projectAmazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import projectAmazon.HomePage;
import projectAmazon.Registration;

public class TestCase1  extends Launch_Quit
{   //registration
	@Test(retryAnalyzer=projectAmazon.RetryAnalyzerconcept.class)  
	public void registration_amazon() throws InterruptedException, EncryptedDocumentException, IOException 
	{
       Ddt_Class d1=new Ddt_Class();
       d1.ddtmethod();
	HomePage h1=new HomePage(driver);
	h1.acandlist(driver);
	Thread.sleep(1000);
	h1.signinmethod();
	
	Registration r1=new Registration(driver);
	r1.creating_account();
	r1.your_name();
	Thread.sleep(3000);
	r1.mobile_no();
	r1.pwd();
	r1.verify_no();
	}
}

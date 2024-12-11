package projectAmazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import projectAmazon.HomePage;
import projectAmazon.Login;

public class TestCase2 extends Launch_Quit
{     //Login
	@Test(retryAnalyzer=projectAmazon.RetryAnalyzerconcept.class)  
	public void logintoamazon() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		Ddt_Class d1=new Ddt_Class();
		d1.ddtmethod();
		HomePage h1=new HomePage(driver);
		h1.acandlist(driver);
		Thread.sleep(2000);
		h1.signinmethod();
		
		Login l1=new Login(driver);
		l1.emailmethod();
		l1.continue_button();
		l1.pwd();
		l1.submit_button();
		
	}

}

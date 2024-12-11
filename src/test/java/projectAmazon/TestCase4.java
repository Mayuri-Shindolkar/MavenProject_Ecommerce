package projectAmazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import projectAmazon.HomePage;
import projectAmazon.ProfileInformation;

public class TestCase4 extends Launch_Quit
{
	@Test(retryAnalyzer=projectAmazon.RetryAnalyzerconcept.class)
	public void profileinfo() throws EncryptedDocumentException, IOException 
	{     //profilr information
		Ddt_Class d1=new Ddt_Class();
		d1.ddtmethod();
		HomePage h1=new HomePage(driver);
		h1.acandlist(driver);
		h1.signinmethod();
		
		
		ProfileInformation p1=new ProfileInformation(driver);
		p1.emailmethod();
		p1.continue_button();
		p1.pwd();
		p1.submit_button();
		p1.accountandlist();
		p1.login_security();
		ProfileInformation_edit p2=new ProfileInformation_edit(driver);
		p2.name1();
		p2.name2();
		//p2.email_edit1();
		//p2.email_edit2();
		p2.mobile1();
		p2.mobile2();
		p2.passkey1();
		p2.passkey2();
		p2.password1();
		p2.password2();	
		
	}
}

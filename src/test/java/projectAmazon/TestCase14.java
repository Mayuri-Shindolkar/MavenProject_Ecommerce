package projectAmazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase14 extends Launch_Quit
{  //product rating
	@Test(retryAnalyzer=projectAmazon.RetryAnalyzerconcept.class)
	public void product_ratings() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Ddt_Class d1=new Ddt_Class();
		d1.ddtmethod();
		HomePage h1=new HomePage(driver);
		h1.acandlist(driver);
		h1.signinmethod();
		
		Login l1=new Login(driver);
		l1.emailmethod();
		l1.continue_button();
		l1.pwd();
		l1.submit_button();
		Product_Rating p1=new Product_Rating(driver);
		p1.order();
		p1.leave_seller();
		p1.star_1();
		//Thread.sleep(1000);
		p1.star_2();
		//Thread.sleep(1000);
		p1.star_3();
		//Thread.sleep(1000);
		p1.star_4();
		//Thread.sleep(1000);
		p1.star_5();
		//Thread.sleep(1000);
		
	}
	

}

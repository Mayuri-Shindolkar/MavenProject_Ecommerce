package projectAmazon;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase12 extends Launch_Quit 
{
	@Test(retryAnalyzer=projectAmazon.RetryAnalyzerconcept.class)
	public void select_paymentmethod() throws EncryptedDocumentException, IOException, InterruptedException 
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
		
		Adding_To_Cart s1=new Adding_To_Cart (driver);
		s1.searchingmethod();
		s1.productgmethod();
		Set<String> s2= driver.getWindowHandles();
		 Iterator<String> i1=s2.iterator();
		 String pa_id=i1.next();
		 String c_id=i1.next();
		 driver.switchTo().window(c_id);
		 
		 SelectEachPaymentMethod p1=new SelectEachPaymentMethod(driver);
		 p1.proceedtobuy1();
		 p1.amazonpay1();
		 Thread.sleep(500);
		 p1.creditdeebitcard1();
		 Thread.sleep(500);
		 p1.creditanotherway1();
		 Thread.sleep(500);
		 p1.netbanking1();
		 Thread.sleep(500);
		 p1.upiapps1();
		 Thread.sleep(500);
		 p1.emi1();
		 Thread.sleep(500);
		 p1.cashondelivery1();
		 Thread.sleep(500);
		 
		 
	}

}

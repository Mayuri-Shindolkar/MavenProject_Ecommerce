package projectAmazon;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestCase13 extends Launch_Quit
{
	@Test(retryAnalyzer=projectAmazon.RetryAnalyzerconcept.class)
	public void applying_couponCode() throws EncryptedDocumentException, IOException, InterruptedException
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
		
		
		Applying_CouponCode a1=new Applying_CouponCode(driver);
		a1.proceedtobuy1();
		a1.cardsection1();	
		a1.entercarddetails1();
		Thread.sleep(6000);
		
		a1.iframe1();
		Thread.sleep(3000);
		a1.card_no1();
		Thread.sleep(2000);
		 
	}

}

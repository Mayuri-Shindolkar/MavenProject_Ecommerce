package projectAmazon;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestCase10 extends Launch_Quit
{
	@Test(retryAnalyzer=projectAmazon.RetryAnalyzerconcept.class)
     public void cart_quantity() throws EncryptedDocumentException, IOException, InterruptedException
     {
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
			
			/*Adding_To_Cart s1=new Adding_To_Cart (driver);
			s1.searchingmethod();
			s1.productgmethod();
			Set<String> s2= driver.getWindowHandles();
			 Iterator<String> i1=s2.iterator();
			 String pa_id=i1.next();
			 String c_id=i1.next();
			 driver.switchTo().window(c_id);
			s1.cartmethod();*/
	       CartQuantity c1=new CartQuantity (driver);
	       c1.searchingmethod();
			c1.productgmethod();
			Set<String> s2= driver.getWindowHandles();
			 Iterator<String> i1=s2.iterator();
			 String pa_id=i1.next();
			 String c_id=i1.next();
			 driver.switchTo().window(c_id);
			c1.cartmethod();
			Thread.sleep(2000);
			c1.gotocart1();
			c1.addingquantity1();
			Thread.sleep(2000);
			c1.removingquantity1();
			//c1.removingquantity1();
			Thread.sleep(2000);
			c1.removingfromcart1();
			
			
	
			//Assert.assertEquals(driver.getTitle(),"https://www.amazon.in/cart","Test case is pass");
			  
		}
     }
}

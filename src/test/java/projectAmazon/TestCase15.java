package projectAmazon;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class TestCase15 extends Launch_Quit 
{
	@Test(retryAnalyzer=projectAmazon.RetryAnalyzerconcept.class)
	public void cartpage_withoutlogin()
	{
		Cartpage_Withoutlogin c1=new Cartpage_Withoutlogin(driver);
		c1.searchingmethod();
		c1.productgmethod();
		Set<String> s2= driver.getWindowHandles();
		 Iterator<String> i1=s2.iterator();
		 String pa_id=i1.next();
		 String c_id=i1.next();
		 driver.switchTo().window(c_id);
		c1.cartmethod();
	}

}

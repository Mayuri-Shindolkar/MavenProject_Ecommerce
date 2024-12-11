package projectAmazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Applying_CouponCode
{
	WebDriver driver;
	@FindBy(name="submit.buy-now")
	WebElement proceedtobuy;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement cardsection;
	@FindBy(xpath="//a[.='Enter card details']")
	WebElement entercarddetails;
	@FindBy(name="ApxSecureIframe")
	WebElement iframe;
	@FindBy(name="addCreditCardNumber")
	WebElement card_no;
	@FindBy(xpath="(//span[@class='a-button-text a-declarative'])[3]")
	WebElement date;
	@FindBy(xpath="(//span[@class='a-dropdown-prompt'])[4]")
	WebElement year;
	
	//step2
			public void proceedtobuy1()
			{
				proceedtobuy.click();
			}
			
			public void cardsection1()
			{
				cardsection.click();
			}
			public void entercarddetails1()
			{
				entercarddetails.click();
			}
			
			public void iframe1()
			{
				driver.switchTo().frame(iframe);
			}
			public void card_no1()
			{
				card_no.sendKeys("5241933624315008");
			}
			public void date1()
			{
				date.sendKeys("5241933624315008");
			}
			public void year1()
			{
				year.sendKeys("5241933624315008");
			}
			
			//step3
			public Applying_CouponCode(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}		

	
}

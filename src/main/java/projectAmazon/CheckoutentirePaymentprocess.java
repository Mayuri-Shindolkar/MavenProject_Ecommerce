package projectAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutentirePaymentprocess 
{
	WebDriver driver;
	@FindBy(name="submit.buy-now")
	WebElement proceedtobuy;
	@FindBy(id="addressChangeLinkId")
	WebElement addresschange;
	@FindBy(name="submissionURL")
	WebElement addressselection;
	@FindBy(xpath="//a[.='Close']")
	WebElement close;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement paymentselection;
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement revieworder;

	public void proceedtobuy1()
	{
		proceedtobuy.click();
	}
	public void addresschange1()
	{
		addresschange.click();
	}
	public void addressselection1()
	{
		addressselection.click();
	}
	public void close1()
	{
		close.click();
	}
	public void paymentselection1()
	{
		paymentselection.click();
	}
	public void revieworder1()
	{
		revieworder.click();
	}
	
	public CheckoutentirePaymentprocess (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}

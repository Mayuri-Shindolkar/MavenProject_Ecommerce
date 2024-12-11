package projectAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SelectEachPaymentMethod 
{
	WebDriver driver;
	@FindBy(name="submit.buy-now")
	WebElement proceedtobuy;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement amazonpay;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement creditdeebitcard;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement creditanotherway;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement netbanking;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement upiapps;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement emi;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement cashondelivery;
	//step2
	
	public void proceedtobuy1()
	{
		proceedtobuy.click();
	}
	public void amazonpay1()
	{
		amazonpay.click();
	}
	public void creditdeebitcard1()
	{
		creditdeebitcard.click();
	}
	public void creditanotherway1()
	{
		creditanotherway.click();
	}
	public void netbanking1()
	{
		netbanking.click();
	}
	public void upiapps1()
	{
		upiapps.click();
	}
	public void emi1()
	{
		emi.click();
	}
	public void cashondelivery1()
	{
		cashondelivery.click();
	}
	
	//step3
	public SelectEachPaymentMethod  (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}

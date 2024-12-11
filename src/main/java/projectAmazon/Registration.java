package projectAmazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Registration extends Ddt_Class
{
	WebDriver driver;
	
	@FindBy(id="createAccountSubmit")
	WebElement creatingaccount;
	@FindBy(id="ap_customer_name")
	WebElement yourname;
	@FindBy(id="ap_phone_number")
	WebElement mobileno;
	@FindBy(id="ap_password")
	WebElement pwd1;
	@FindBy(id="continue")
	WebElement verify;
	
	//step2
	
	public void creating_account()
	{
		creatingaccount.click();
	}
	public void your_name()
	{
		yourname.sendKeys("Mayuri Shindolkar");
	}
	public void mobile_no() throws EncryptedDocumentException, IOException
	{
		mobileno.sendKeys(mobile_no);
	}
	public void pwd()
	{
		pwd1.sendKeys(password);
	}
	public void verify_no()
	{
		verify.click();
	}
	
	//step3
	public Registration(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


}

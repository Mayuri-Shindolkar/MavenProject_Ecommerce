package projectAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileInformation_edit 
{ 
	WebDriver driver;
	@FindBy(xpath="(//a[.='Edit'])[1]")
	WebElement name;
	@FindBy(xpath="//a[.='Add']")
	WebElement email_edit;
	@FindBy(xpath="(//a[.='Edit'])[2]")
	WebElement mobile ;
	@FindBy(xpath="//a[.='Set up']")
	WebElement passkey ;
	@FindBy(xpath="(//a[.='Edit'])[3]")
	WebElement password ;
	@FindBy(id="cnep_1C_submit_button")
	WebElement names;
	@FindBy(xpath="(//a[@class='a-link-normal'])[2]")
	WebElement email_edits;
	@FindBy(id="auth-change-phone-cancel")
	WebElement mobiles ;
	@FindBy(xpath="(//a[@class='a-link-normal'])[2]")
	WebElement passkeys ;
	@FindBy(xpath="(//a[@class='a-link-normal'])[2]")
	WebElement passwords ;
	
	public void name1()
	{
		name.click();
	}
	public void email_edit1()
	{
		email_edit.click();
	}
	public void mobile1()
	{
		mobile.click();
	}
	public void passkey1()
	{
		passkey.click();
	}
	public void password1()
	{
		password.click();
	}
	public void name2()
	{
		names.click();
	}
	public void email_edit2()
	{
		email_edits.click();
	}
	public void mobile2()
	{
		mobiles.click();
	}
	public void passkey2()
	{
		passkeys.click();
	}
	public void password2()
	{
		passwords.click();
	}

	//step3
	public ProfileInformation_edit (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}


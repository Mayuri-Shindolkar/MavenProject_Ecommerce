package projectAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileInformation  extends Ddt_Class
{
	
	WebDriver driver;
	@FindBy(name="email")
	WebElement email;
	@FindBy(id="continue")
	WebElement continue_button;
	@FindBy(name="password")
	WebElement pwd1;
	@FindBy(id="signInSubmit")
	WebElement submit;
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement account_list;
	@FindBy(xpath="(//span[@class='a-color-secondary'])[2]")
	WebElement loginandsecurity ;
	
    //step2
	public void emailmethod()
	{
		email.sendKeys(profileinfo_username);
	}
	public void continue_button()
	{
		continue_button.click();
	}
	public void pwd()
	{
		pwd1.sendKeys(profileinfo_password);
	}
	public void submit_button()
	{
		submit.click();
	}
	public void accountandlist()
	{
		account_list.click();
	}
	public void login_security()
	{
		loginandsecurity.click();
	}
	
	

	//step3
	public ProfileInformation (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
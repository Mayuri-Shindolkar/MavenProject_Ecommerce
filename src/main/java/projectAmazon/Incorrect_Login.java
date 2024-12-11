package projectAmazon;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Incorrect_Login extends Ddt_Class
{
		//step1
		WebDriver driver;
		WebElement email;
		@FindBy(id="continue")
		WebElement continue_button;
		@FindBy(name="password")
		WebElement pwd1;
		@FindBy(id="signInSubmit")
		WebElement submit;	
		//step2
		public void emailmethod1()
		{
		try {
			email.sendKeys(Invalid_username);
		}
		catch(ElementNotInteractableException e1)
		{
			System.out.println("invalid username");
		}
			
		}
		public void continue_button()
		{
			continue_button.click();
		}
		public void pwd2()
		{
			pwd1.sendKeys(Invalid_password);
			
		}
		public void submit_button()
		{
			submit.click();
			
		}
		
		//step3
		public Incorrect_Login(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	

}

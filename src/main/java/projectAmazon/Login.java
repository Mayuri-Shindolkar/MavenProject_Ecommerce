package projectAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login extends Ddt_Class
{
		//step1
		WebDriver driver;
		@FindBy(name="email")
		WebElement email;
		@FindBy(id="continue")
		WebElement continue_button;
		@FindBy(name="password")
		WebElement pwd1;
		@FindBy(id="signInSubmit")
		WebElement submit;
		@FindBy(id="twotabsearchtextbox")
		WebElement searching;
		//step2
		public void emailmethod()
		{
			email.sendKeys(username);
		}
		public void continue_button()
		{
			continue_button.click();
		}
		public void pwd()
		{
			pwd1.sendKeys(password);
		}
		public void submit_button()
		{
			submit.click();
		}
		public void searchingmethod()
		{
			Assert.assertEquals(searching.isDisplayed(),true,"Test case is pass");
		}
		//step3
		public Login(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	

}

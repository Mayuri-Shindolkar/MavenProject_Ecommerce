package projectAmazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage_Withoutlogin
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searching;
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement product ;
	@FindBy(id="add-to-cart-button")
	WebElement cart;
	
	public void searchingmethod()
	{
		searching.sendKeys("shoe" +Keys.ENTER);
		
	}
	public void productgmethod()
	{
		product.click();
		
	}
	public void cartmethod()
	{
		cart.click();
		//Assert.assertEquals(cart.isDisplayed(),true,"Test case is pass");
	}
	
	
	//step3
	public Cartpage_Withoutlogin (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}

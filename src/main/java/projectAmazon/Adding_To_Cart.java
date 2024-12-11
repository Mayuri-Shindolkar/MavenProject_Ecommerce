package projectAmazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Adding_To_Cart
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searching;
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement product ;
	@FindBy(id="add-to-cart-button")
	WebElement cart;
	//step2
	
	
	public void searchingmethod()
	{
		searching.sendKeys("shoe" +Keys.ENTER);
		//Assert.assertEquals(searching.isDisplayed(),true,"Test case is pass");
	}
	public void productgmethod()
	{
		product.click();
		
	}
	public void cartmethod()
	{
		cart.click();
		
	}
	
	
	//step3
	public Adding_To_Cart (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}



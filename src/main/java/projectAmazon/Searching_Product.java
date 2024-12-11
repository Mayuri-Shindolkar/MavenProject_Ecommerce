package projectAmazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Searching_Product 
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searching;
	//step2
	
	public void searchingmethod()
	{
		searching.sendKeys("toys");
		searching.click();
		Assert.assertEquals(searching.isDisplayed(),true,"Test case is pass");
	}
	
	//step3
	public Searching_Product  (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}

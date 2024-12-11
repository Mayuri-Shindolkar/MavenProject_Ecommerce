package projectAmazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartQuantity
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searching;
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement product ;
	@FindBy(id="add-to-cart-button")
	WebElement cart;
	@FindBy(xpath="(//a[@class='a-button-text'])[3]")
    WebElement gotocart;
	@FindBy(xpath="//span[@class='a-icon a-icon-small-add']")
	WebElement addingquantity;
	@FindBy(xpath="//span[@class='a-icon a-icon-small-remove']")
	WebElement removingquantity;
	@FindBy(xpath="//input[@class='a-color-link'][1]")
	WebElement removingfromcart;
	
	
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
	
	public void gotocart1()
	{
		gotocart.click();
	}
	public void addingquantity1()
	{
		addingquantity.click();
	}
	public void removingquantity1()
	{
		removingquantity.click();
	}
	public void removingfromcart1()
	{
		removingfromcart.click();
	}
	
	//step3
	public CartQuantity (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}

package projectAmazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Searching_With_Filters 
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searching;
	@FindBy(xpath="(//span[@class='a-size-base a-color-base a-text-bold'])[1]")
	WebElement size;
	@FindBy(xpath="(//span[@class='a-size-base a-color-base a-text-bold'])[2]")
	WebElement puma;
	
	public void searchingmethod()
	{
		searching.sendKeys("shoe" +Keys.ENTER);
	}
	public void size1()
	{
		size.click();
	}
	public void puma1()
	{
		puma.click();
	}
	
	//step3
		public Searching_With_Filters(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

}

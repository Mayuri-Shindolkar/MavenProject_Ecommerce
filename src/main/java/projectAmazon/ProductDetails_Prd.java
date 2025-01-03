package projectAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductDetails_Prd
{
		WebDriver driver;
		@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
		WebElement price;
		@FindBy(xpath="(//span[@class='a-size-small'])[2]")
		WebElement description;
		@FindBy(xpath="(//span[@id='acrCustomerReviewText'])[1]")
		WebElement reviews;
		
		public void price1()
		{
			//Assert.assertEquals(
					price.isDisplayed();
					//, "true");
		}
		public void description1()
		{
			description.click();
		}
		public void reviews1()
		{
			
			reviews.click();
		}
		
		
		public ProductDetails_Prd(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

	

}

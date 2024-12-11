package projectAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Product_Rating
{
	WebDriver driver;
	@FindBy(xpath="//span[.='& Orders']")
	WebElement order1;
	@FindBy(id="a-autoid-6-announce")
	WebElement leaveseller;
	@FindBy(name="star1")
	WebElement star1;
	@FindBy(name="star2")
	WebElement star2;
	@FindBy(name="star3")
	WebElement star3;
	@FindBy(name="star4")
	WebElement star4;
	@FindBy(name="star5")
	WebElement star5;
	
	public void order()
	{
		order1.click();
	}
	public void leave_seller()
	{
		leaveseller.click();
	}
	public void star_1()
	{
		star1.click();
	}
	public void star_2()
	{
		star2.click();
	}
	public void star_3()
	{
		star3.click();
	}
	public void star_4()
	{
		star4.click();
	}
	public void star_5()
	{
		star5.click();
		Assert.assertEquals(star5.isDisplayed(), true, "Testcase is pass");
	}
	//step3
	public Product_Rating (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}

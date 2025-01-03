package projectAmazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searching_With_Filters 
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searching;
	@FindBy(xpath="(//span[@class='a-size-base a-color-base a-text-bold'])[1]")
	WebElement size;
	@FindBy(xpath="(//span[@class='a-size-base a-color-base a-text-bold'])[2]")
	WebElement puma;
	@FindBy(xpath="(//input[@class='s-range-input'])[2]")
	WebElement pricerange;
	@FindBy(xpath="//span[.='Shoes']")
	WebElement shoe;
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[36]")
	WebElement womens_shoe;
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement selecting_shoe;
	
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
	public void pricerange1() throws AWTException, InterruptedException 
	{
		Actions a1=new Actions(driver);
		a1.doubleClick(pricerange).perform();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		for(int i=0;i<=100;i++)
		{
			Thread.sleep(1000);
			r1.keyPress(KeyEvent.VK_RIGHT);
		}	
	}
	public void shoe1()
	{
		shoe.click();
	}
	public void womens_shoe1()
	{
		womens_shoe.click();
	}
	public void selecting_shoe1()
	{
		selecting_shoe.click();
	}
	
	//step3
		public Searching_With_Filters(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

}

package projectAmazon;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@Listeners(projectAmazon.Listeners_Class.class)
public class Launch_Quit extends Listeners_Class
{
	//WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
    
    public void testcase1(String nameofbrowser)
    {
    	if(nameofbrowser.equals("chrome"))
    	{
    		driver=new ChromeDriver();
    	}
    	
    	if(nameofbrowser.equals("edge"))
    	{
    		driver=new EdgeDriver();
    	}
    	if(nameofbrowser.equals("firefox"))
    	{
    		driver=new FirefoxDriver();
    	}
    	driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();
	}

}

package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class testbase 
{
	public static WebDriver driver; 
	
	@BeforeSuite	
	public void Init()
	{
		try
		{
			
			// need to ask this, this is giving me an error as file rename
			/*Browser browser = new Browser();			
			driver = browser.get(Property.getPropertyValue("browser"));*/
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();			
			navigate();
			SetBrowserSettings();			
			
		}
		catch(Exception e)
		{
			System.err.println("Got an error while initialising");
		}
		
			
	}
	
	@Test
	public void ablmethod()
	{
		System.out.println(" abc ");
	}
	
	public void SetBrowserSettings()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
	}
	
	public void navigate()
	{
		try 
		{
			//driver.get(Property.getPropertyValue("URL"));
			driver.get("http://amazon.in");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
	}
	
	//@AfterSuite
	public void TearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
		
	}


}

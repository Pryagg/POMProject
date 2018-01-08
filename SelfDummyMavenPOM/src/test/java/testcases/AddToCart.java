package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.HomePage1;

public class AddToCart
{
	static WebDriver driver;
	
		
	@Test
	public void meth1()
	{

		try
		{
			
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
			driver.get("http://amazon.in");			
			//System.out.println("shirt");
			HomePage1 obj = PageFactory.initElements(driver, HomePage1.class);						
			Thread.sleep(300);
			//HomePage1 obj = new HomePage1(driver);
			/*hmepage.EnterSearchedProduct("Shirt");			
			hmepage.ClickSearchButton();*/
			/*driver.findElement(By.id("twotabsearchtextbox")).clear();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");*/
			//driver.findElement(By.id("twotabsearchtextbox")).clear();
			//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
			
			obj.EnterSearchedProduct("shoes");
			obj.ClickSearchButton();
			
			
			
			/*SearchBox.clear();
			SearchBox.sendKeys("shirt");*/
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

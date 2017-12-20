package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class ProductSuccessfullyAddedToCart extends testbase
{
	static WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchBox;
	
	/*public ProductSuccessfullyAddedToCart(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}*/
	
	@Test
	public void AddedToCart()
	{
		
		try
		{
			
			
			
			System.out.println("shirt");
			//HomePage1 hmepage = PageFactory.initElements(driver, HomePage1.class);
			
			//Thread.sleep(300);
			//hmepage.EnterSearchedProduct("Shirt");
			//hmepage.ClickSearchButton();
			driver.findElement(By.id("twotabsearchtextbox")).clear();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
			
			/*SearchBox.clear();
			SearchBox.sendKeys("shirt");*/
			
			
		}
		catch(Exception e)
		{
			
		}
	}

}

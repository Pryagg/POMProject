package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import datatable.ProductName_ExcelSheet;

public class HomePage1 
{
	//Page factory concept by Page Oject Design Pattern
	
		final WebDriver driver ;
		
		//Page Object constructor which passes the driver context forward
		public HomePage1(WebDriver driver) 
		{
			this.driver = driver;
		}
		
		@FindBy(id="twotabsearchtextbox")
		WebElement SearchBox;
		
		@FindBy(xpath="//input[@value='Go']")
		WebElement SearchButton ; 
		
		
		public void ClickSearchButton()
		{
			try
			{
	
				SearchButton.click();	
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			
			}
		}
			/*public void EnterSearchedProduct()
			{
				try
				{
					ProductName_ExcelSheet pdname = new ProductName_ExcelSheet();
					SearchBox.clear();				
					System.out.println(pdname.ProductName());
					SearchBox.sendKeys(pdname.ProductName());
					
							
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				
				}
		}
		*/
		
		
		public void EnterSearchedProduct(String productname)
		{
			try
			{
				//ProductName_ExcelSheet pdname = new ProductName_ExcelSheet();
				SearchBox.clear();				
				SearchBox.sendKeys(productname);
				
						
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			
			}
	}
	


}

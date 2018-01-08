package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.testbase;
import datatable.ProductName_ExcelSheet;

public class HomePage1 extends testbase 
{
	//Page factory concept by Page Object Design Pattern
	
		WebDriver driver ;
		
		@Override
		public void TearDown() {
			// TODO Auto-generated method stub
			System.out.println();
			super.TearDown();
		}
		
		//Page Object constructor which passes the driver context forward
		public HomePage1() 
		{
			System.out.println("Default Cons");
		}
		
		public HomePage1(WebDriver driver) 
		{
			System.out.println("Default Cons");
			this.driver = driver;
			//PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="twotabsearchtextbox")
		WebElement SearchBox;
		
		@FindBy(xpath="//input[@value='Go']")
		WebElement SearchButton ; 
		
		
		public void ClickSearchButton()
		{
			try
			{
				//driver.
	
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

package adummy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Code {

	public static void main(String[] args) 
	{
		// excel sheet class object
		takedatafromexcelsheet td = new takedatafromexcelsheet();
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		// get the amazon url
        driver.get("http://www.amazon.in");
        // clear the searchbox
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		//type the product name as shoes
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		// take the product name from ExcelSheet
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(td.ProductName());
		
		//click on GO Button
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		// Click on first Product
		driver.findElement(By.xpath("//*[@id='atfResults']//li[1]//div[4]/div[1]/a[1]")).click();
		// get the product price
		String prdctprcc = driver.findElement(By.xpath(".//*[@id='priceblock_saleprice']")).getText().trim();
		//Click on ADD To Cart Button
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
		System.out.println(prdctprcc);
		
	
		
		
		
		
	

	}

}

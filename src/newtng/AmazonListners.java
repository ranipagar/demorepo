package newtng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonListners {

	static WebDriver driver;
	
	@Test(priority=1)
	public void navToURL()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse setup\\chromedriver.exe");
		
 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
	}
	
	@Test(priority=2)
	public void searchTest() {
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile phone");
		
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click(); //click on search button
		
		String actual=driver.getTitle();
		
		String expected="Amazon.in:mobilephone";
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority=3)
	public void clickOnProduct()
	{
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@data-asin='B08444S68L']//*[@class='a-size-medium a-color-base a-text-normal']")).click();	
		Set<String>allwinid = driver.getWindowHandles();
		
		for(String id :allwinid)
		{
			if(!(id.equals(parent)))
			{
				driver.switchTo().window(id);
			}
		}
		
		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		
		
	}
}

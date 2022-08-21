package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GitSS {

	public static void captureScreenshot(WebDriver driver, String filename) throws IOException
	{
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		
String path = "E:\\ss\\facebook2.png";
	
//	String path = "F:\\Desktop\\VimanNagar\\May 21\\16 April Selenium Basics\\screenshot\\"+filename+".png";	
	
	//String path  = System.getProperty("user.dir")+"\\screenshot\\"+filename+".png";
	
		File destination = new File(path);
			
		FileHandler.copy(source, destination);
	}
	
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","F:\\\\Eclipse setup\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		
		driver.get("https://www.facebook.com/signup");
		
		
	TakesScreenshot scrshot = (TakesScreenshot)driver;
		
	File source = scrshot.getScreenshotAs(OutputType.FILE);
	
	String path = "E:\\ss\\facebook2.png";
	
	File destination = new File(path);
		
	FileHandler.copy(source, destination);

	}
}

package utility;

import java.io.File;
import org.openqa.selenium.io.FileHandler;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

public static void main(String[] args) throws IOException  {
	
System.setProperty("webdriver.chrome.driver", "F:\\Eclipse setup\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://facebook.com/signup");

TakesScreenshot scnsht= (TakesScreenshot)driver;

File source =scnsht.getScreenshotAs(OutputType.FILE);

String path ="E:\\ss\\loginss.png";

File destination = new File(path);

FileHandler.copy(source,destination);
}
}
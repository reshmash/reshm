package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
 
public class a2 {
 
static
{
	
 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws IOException
{
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.google.com");
 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(screenshotFile,new File("./demo.png"));
 driver.close();
 driver.quit(); 
 }
}
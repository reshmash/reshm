package qsp;

import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class pr4 {
	
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args)
{
	 WebDriver driver=new ChromeDriver();
	 
	// Maximize the window
	driver.manage().window().maximize();
	 
	// Pass the url
	driver.get("http://www.google.com");
	
	Comparable<java.io.File> ts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//File dest=new File("./demo/png");
	FileUtils.copyFile(ts, new File("./demo.png"));
}
}
	
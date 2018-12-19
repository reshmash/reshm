package qsp;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class a1
{
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("LM6RPg")).sendKeys("samsung j7");
		 List<WebElement> all = driver.findElements(By.className("LM6RPg"));
		 int count=all.size();
		 System.out.println(count);
		Thread.sleep(1000);
		
		//File screenshotFi = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(screenshotFi,new File("./demo.png"));
		//java.io.File SrcFile=ts.getScreenshotAs(OutputType.FILE);
		//File src=ts.getScreenshotAs(OutputType.FILE);
		//File dest=new File("file:///D:/eclipse-workspace/Automation/src/qsp/demo.png");
		//FileUtils.copyFile(srcFile, dest);
		
		/*for(int i=1;i<count;i++)
		{
			WebElement sug = all.get(2);
			String text=sug.getText();
			
            System.out.println(text);
		}*/
		for( WebElement sug:all)
		{
			String text=sug.getText();
			System.out.println(text);
		}
		Thread.sleep(1000);
		all.get(count-1).click();
		Thread.sleep(1000);
		
		driver.close();
		
	}
}
		
		
		
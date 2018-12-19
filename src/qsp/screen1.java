package qsp;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen1 {
	
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws IOException, InterruptedException
		{
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			 TakesScreenshot ts = (TakesScreenshot)driver;
File src= ts.getScreenshotAs(OutputType.FILE);
File dest=new File("./demo1/png");
FileUtils.copyFile(src, dest);
Thread.sleep(1000);
driver.close();
		}
}




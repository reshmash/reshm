package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autoit1 {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[.='3.141.59']")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Users\\COMPAQ\\Desktop\\NEW2.exe");
		Thread.sleep(1000);
		driver.close();
		
		
		
	}

}

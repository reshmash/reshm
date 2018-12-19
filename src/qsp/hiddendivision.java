package qsp;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hiddendivision {
	static
	{
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		Date date=new Date();
		SimpleDateFormat spl=new SimpleDateFormat("dd");
		String day=spl.format(date);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		String month = null;
		driver.findElement(By.xpath("//span[.='"+month+"']/../../..//a[.='"+day+"']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}

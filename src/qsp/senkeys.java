package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class senkeys {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement un = driver.findElement(By.id("email"));
	
	un.sendKeys("admin");
	un.sendKeys(Keys.CONTROL+"ac");
	WebElement pn = driver.findElement(By.id("pass"));
	pn.sendKeys(Keys.CONTROL+"v");
	driver.close();
	
	}


}

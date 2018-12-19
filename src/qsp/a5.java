package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a5
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key= "webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
        WebDriver driver= new ChromeDriver();
		Thread.sleep(1000);
		
		driver.close();
		
	}

}

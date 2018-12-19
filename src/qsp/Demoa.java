package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoa
{

public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value= "./driver/geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(200);
		driver.close();
	}
	





}
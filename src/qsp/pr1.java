package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class pr1
{
	public static void main(String[] args) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe"); 
	System.out.println("name");
	Scanner sc=new Scanner(System.in);
	String browser= sc.nextLine();
	WebDriver driver= null;
	if(browser.equals("chrome"))
	{
	WebDriver driver1 = new ChromeDriver();
	} 
	else
	{
		WebDriver driver2 = new FirefoxDriver();

	}
	Thread.sleep(2000);
	driver.close();
	}
}
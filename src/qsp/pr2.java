package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pr2 {
	static
	{
 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
 System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) //throws InterruptedException
	{
		System.out.println("enter browser name");
		Scanner sc= new Scanner(System.in);
		String browser=sc.nextLine();
		if(browser.equals("chrome"))
		{
			WebDriver driver=new ChromeDriver();
			Thread.sleep(1000);
		}
		else
		{
			WebDriver driver=new FirefoxDriver();
			Thread.sleep(2000);
		}
		
		sc.close();
	}

	 
 }


package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assin1 {
	
		static
		{
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		}

		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com");
	        WebElement	h=	driver.findElement(By.id("day"));
		    Thread.sleep(1000);
		    Select sc=new Select(h);
		    Thread.sleep(1000);
		    sc.selectByIndex(2);
		    Thread.sleep(1000);
		    sc.selectByValue("10");
		    Thread.sleep(1000);
		    sc.selectByVisibleText("12");
		    sc.deselectByValue("12");
		    Thread.sleep(1000);
		    driver.close();
		}
	}

		

		

			



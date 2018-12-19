package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a7
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	}
 public static void main(String[] args) throws InterruptedException
 {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.findElement(By.id("lst-ib")).sendKeys("qspiders");
	  Thread.sleep(1000);
	  List<WebElement> all = driver.findElements(By.className("sbqs_c"));
	  Thread.sleep(1000);
	  int count=all.size();
	  System.out.println(count);
	  for (int i=0;i<count;i++)
	  {
		  WebElement sug = all.get(i);
		  String text=sug.getText();
		  System.out.println(text);
		  
	  }
	  Thread.sleep(1000);
		 all.get(count-1).click();
		 Thread.sleep(1000);
		 driver.close();
	  }
 }
 

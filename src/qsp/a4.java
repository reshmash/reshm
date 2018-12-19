package qsp;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a4
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
	  List<WebElement> all = driver.findElements(By.className("gsfi"));
	  Thread.sleep(1000);
	  int count=all.size();
	  System.out.println(count);
	  for (int i=1;i<count;i++)
	  {
		  WebElement sug = all.get(i);
		  String text=sug.getText();
		  if(text.equals("qspiders hebbal"))
		  {
			  sug.click();
			  break;
		  }
		  else
			  System.out.println("wrong");
		  break;
	  }
	  Thread.sleep(1000);
	  driver.close();
 }
}

 

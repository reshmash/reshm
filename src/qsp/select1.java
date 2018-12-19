package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args)
{
WebDriver driver=  new ChromeDriver();	
driver.get("file:///C:/Users/COMPAQ/Desktop/aaq.html");
 WebElement het = driver.findElement(By.id("a"));
 HashSet<String> hs=new HashSet<String>();
Select sc=new Select(het);
 List<WebElement> ab = sc.getOptions();
 int count=ab.size();
 for(int i=0;i<count;i++)
 {
	 WebElement ax = ab.get(i);
	String ay = ax.getText();
	hs.add(ay);
 }
 for(String h:hs)
 {
	 System.out.println(h);
 }
 driver.close();
}
}


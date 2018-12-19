package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select3
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args)
{
WebDriver driver=  new ChromeDriver();	
driver.get("file:///C:/Users/COMPAQ/Desktop/aaq.html");
 WebElement het = driver.findElement(By.id("a"));
 ArrayList<String> str = new ArrayList<String>();
Select sc=new Select(het);
 List<WebElement> ab = sc.getOptions();
 int count=ab.size();
 System.out.println(count);
 for(int i=0;i<count;i++)
 {
    WebElement option = ab.get(i);
    String text=option.getText();
    str.add(text);
 }
 if(str.contains("idly"))
 {
	 System.out.println("repeated");
	 
	 
	 
 }
}
}
    
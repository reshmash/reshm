package qsp;


	import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class select2
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
	 for(int i=0;i<count;i++)
	 {
	    WebElement ax = ab.get(i);
	    String text= ax.getText();
	    str.add(text);
	 }
	 ArrayList<String> cpystr = new ArrayList<String>(str);
	 Collections.sort(cpystr);
	 
		if(str.equals(cpystr))
		{
			System.out.println("sorted");
			
		}
		else
			System.out.println("not sorted");
	}
	}
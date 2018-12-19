package qsp;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a9 {
	static
	{
 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/COMPAQ/Desktop/aaq.html");
        WebElement	h=	driver.findElement(By.id("a"));
	    Thread.sleep(1000);
	    Select sc=new Select(h);
	    Thread.sleep(1000);
	    sc.selectByIndex(2);
	    Thread.sleep(1000);
	    sc.selectByValue("s");
	    Thread.sleep(1000);
	    sc.selectByVisibleText("idly");
	    Thread.sleep(1000);
	    driver.close();
	}
}

	

	

		
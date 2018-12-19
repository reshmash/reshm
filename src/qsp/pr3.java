package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr3 {
	static
	{
 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
 System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Dimension d = new Dimension(200,20);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		Point p=new Point(50,50);
		driver.manage().window().setPosition(p);
		driver.close();
}
}
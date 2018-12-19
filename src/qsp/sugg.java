package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sugg {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args)
{
	 ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.findElement(By.className("gLFyf gsfi")).sendKeys("qspiders hebbal");
	List<WebElement> a = driver.findElements(By.xpath("//span[qspiders hebbal]"));
	for( WebElement sug:a)
	{
		String text=sug.getText();
		if(text.equals("qspiders hebbal"))
		{
		sug.click();
		break;
		
		}
	}
}
}

	
	



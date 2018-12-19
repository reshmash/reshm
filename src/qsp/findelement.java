package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class findelement {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args)
{
	 ChromeDriver driver = new ChromeDriver();
	 WebDriverWait Wait = new WebDriverWait(driver,10);
	 Wait.until(ExpectedConditions.titleIs("title"));
	driver.get("https://www.seleniumhq.org/");
	List<WebElement> a = driver.findElements(By.xpath("//a"));
	int count=a.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		WebElement link = a.get(i);
		String text=link.getText();
		System.out.println(text);
	}
}

	
}
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class encaps {
	private WebElement untb;
	private WebElement  pntb;
	private WebElement lgbt;



public encaps(WebDriver driver)
{
untb=driver.findElement(By.id("username"));
pntb=driver.findElement(By.name("pwd"));
lgbt= driver.findElement(By.xpath("//div[.='Login ']"));
		}
public void usname(String un)
{
	untb.sendKeys(un);
}
public void pwd(String pw)
{
	pntb.sendKeys(pw);
}
public void clickonlogin()
{
	lgbt.click();
}

}
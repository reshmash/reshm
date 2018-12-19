package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	fb1 fb=new fb1(driver);
	fb.email("sudirao");
	Thread.sleep(1000);
	fb.pass("Passwor");
	Thread.sleep(1000);
	//fb.fname("aa");
	//fb.sname("bb");
	fb.login();
	Thread.sleep(1000);
	fb.email("sudirao87");
	Thread.sleep(1000);
	fb.pass("Password87");
	Thread.sleep(1000);
	//fb.fname("aa");
	//fb.sname("bb");
	fb.login();
}
}

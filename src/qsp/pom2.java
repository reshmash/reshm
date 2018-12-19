package qsp;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class pom2
	{
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		encaps en=new encaps(driver);
		en.usname("a");
		Thread.sleep(1000);
		en.pwd("mar");
		en.clickonlogin();
		Thread.sleep(1000);
		en.usname("admin");
		Thread.sleep(1000);
		en.pwd("manager");
		en.clickonlogin();
		Thread.sleep(1000);
		driver.close();
		
	}
	}




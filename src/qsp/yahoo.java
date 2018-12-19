package qsp;


	


	import java.util.Scanner;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class yahoo 
	{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name");
		String un=sc.nextLine();
		System.out.println("enter password");
		String pw=sc.nextLine();
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/config/login?");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='phone-no ']")).sendKeys(un);
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login-passwd")).sendKeys(pw);
		driver.findElement(By.id("login-signin")).click();
	    driver.close();
	}
	}





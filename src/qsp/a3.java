package qsp;


	import java.util.Scanner;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.*;

	public class a3 
	
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
		//WebDriver driver= new ChromeDriver();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"
				+ "");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//content[class='CwaK9']")).();
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys(pw);
		driver.findElement(By.id("u_0_3")).click();
	    driver.close();
	}
	}






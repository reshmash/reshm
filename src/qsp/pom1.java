package qsp;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class pom1 {
		@FindBy(id="username")
		private WebElement untb;
		@FindBy(name="pwd")
		private WebElement  pntb;
		@FindBy(xpath="//div[.='Login ']")
		private WebElement lgbt;



	public pom1(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
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
	


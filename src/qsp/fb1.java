package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//declaration
 class fb1
{
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement pass;
	@FindBy(id="u_0_2")
	private WebElement login;
	@FindBy(id="u_0_j")
	private WebElement fname;
	
	@FindBy(id="u_0_l")
	private WebElement sname;

//initialization
 public fb1(WebDriver driver)
 {
	
	PageFactory.initElements(driver, this);
 }
 public void email(String em)
 {
	 email.sendKeys(em);
 }
 public void pass(String pm)
 {
	 pass.sendKeys(pm); 
	 }
 
 public void login()
 {
	 login.click();; 
	 }
 public void fname(String fn)
 {
	 fname.sendKeys(fn);
 }
 public void sname(String sn)
 {
	 sname.sendKeys(sn);
 }
 
 }
 
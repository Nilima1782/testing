package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sun.security.util.Password;

public class LoginPage {
	
	//span[text()='Sign in']
	
	
	
	@FindBy(xpath="//span[text()='Sign in']") 
	private WebElement signin;
	
	@FindBy(xpath="//input[contains(@class,'a-input-text a-span12 auth-autofocus auth-required-field')]") 
	private WebElement email;

	
	@FindBy(xpath="//input[contains(@type,'password')]") 
	private WebElement password;
	
	
	@FindBy(xpath=" //span[contains(text(),'Sign-In')]") 
	private WebElement Login;
	

@FindBy(xpath="//a[text()='Fresh']") 
private WebElement fresh;



@FindBy(xpath="//a[text()='Amazon Pay']") 
private WebElement amazon;

@FindBy(xpath="//span[text()='Account & Lists']") 
private WebElement accountlist;

@FindBy(xpath="//span[text()='Sign Out']") 
private WebElement signout;



	
	
//	@FindBy(xpath="//a[text()='Forgotten password?']") 
//	private WebElement forgotpass;
//	
//	
//
//	@FindBy(xpath="//a[text()='Create New Account']") 
//	private WebElement createaccount ;
	
	public LoginPage(WebDriver driver2)
	{
		
		PageFactory.initElements(driver2,this);
		
	}
	
	
	
	public void signin() {
		signin.click();
	}
	
	
	public void sendemail() {
		email.sendKeys("nilima1782@gmail.com");
	}
	
	public void sendpassword() {
		password.sendKeys("Harshal1782");
		}
	
	public void clickLogin() {
		Login.click();
		}
	
	public void clickFresh() {
		fresh.click();
		}
	
	
	
	public void clickAmazonPay() {
		amazon.click();
		}
	
	
	public void accountlist() {
		accountlist.click();
		}
	
	public void signout() {
		signout.click();
		}
	
	
	//or 
	
//public void Logintoapplication() {
//email.sendKeys("nilima1782@gmail.com");
//password.sendKeys("harshal1782#");
//forgotpass.click();
//createaccount.click();





		
	}

	



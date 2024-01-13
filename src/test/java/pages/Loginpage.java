package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import base.SharedSteps;

public class Loginpage {
	
	//Page Factory
	
	@FindBy(xpath="//a[@class='ico-login']")
	public static WebElement Login_Link;
	
	@FindBy(id = "Email")
	public static WebElement email;

	@FindBy(id = "Password")
	public static WebElement Password;

	@FindBy(xpath = "//input[@value='Log in']")
	public static WebElement Click_Login;


	public Loginpage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	public void Click_LoginLink() throws InterruptedException {
		Thread.sleep(2000);
		Login_Link.click();
	

}



	public void give_email(String emailID) throws InterruptedException {
		Thread.sleep(2000);
		email.sendKeys(emailID);
	}

	public void give_password(String password) throws InterruptedException {
		Thread.sleep(2000);
		Password.sendKeys(password);
	}

	public void Click_Login() throws InterruptedException {
		Thread.sleep(2000);
		Click_Login.click();
	

}

}
package steps;


//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


import base.BasePage;

//import org.junit.Assert;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


//import base.SharedSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Loginpage;

//import pages.SearchPage;



public class Loginstepdef {
	
	Loginpage loginPage = new Loginpage(BasePage.driver);
	
	

	@Given("I am on DemoWebShop Homepage launching {string}")
	public void i_am_on_demo_web_shop_homepage(String url) {
		BasePage.driver.manage().window().maximize();
		BasePage.driver.get(url);
	
	    
	}

	@When("I click on login link")
	public void i_click_on_login_link() throws InterruptedException {
		loginPage.Click_LoginLink();
	   
	}

	@Then("I will be on Login Page and Capture the title of the page")
	public void i_will_be_on_login_page_and_capture_the_title_of_the_page() throws InterruptedException {
		
		//System.out.println("title of the is page is : "+ driver.getTitle());
	    
	}

	@Then("I entered email id as {string} on the page")
	public void i_entered_email_id_as_on_the_page(String emailID) throws InterruptedException {
		
			Thread.sleep(2000);
			loginPage.give_email(emailID);
		}
	

	@Then("I entered password as {string} on the page")
	public void i_entered_password_as_on_the_page(String password) throws InterruptedException {
		
		
		Thread.sleep(2000);
		loginPage.give_password(password);
	
		
	    
	}

	@Then("I click on Login button")
	public void i_click_on_submit_button() throws InterruptedException {
		
		Thread.sleep(2000);
		loginPage.Click_Login();
	    
	}

}
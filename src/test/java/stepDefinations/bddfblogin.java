package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.testscripts.fbMain;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fblogin.loginFb;

public class bddfblogin {

	public WebDriver driver;
	loginFb login;
	@Given("^user is on fb login page$")
	public void user_is_on_fb_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sbatt\\Desktop\\Krishna Yash\\icloud-selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		login = PageFactory.initElements(driver, loginFb.class);
	}

	@When("^user enters username in the username textbox$")
	public void user_enters_username_in_the_username_textbox() throws Throwable {
//	WebElement username = driver.findElement(By.id("email"));
//    username.sendKeys("myusername@xyz.com");
		login.usrname("krishna");
	} 
    

	@When("^user enters password in the password textbox$")
	public void user_enters_password_in_the_password_textbox() throws Throwable {
//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys("mypassword");
		login.pasword("password");
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
//		WebElement Login = driver.findElement(By.id("loginbutton"));
		login.button();
	}

	@Then("^user navigates to other page$")
	public void user_navigates_to_other_page() throws Throwable {
		WebElement check = driver.findElement(By.xpath("//span[@class='_50f6']"));
		if(check.isDisplayed()) {
		 System.out.println("Login fail"); 
	}
	}
	@Then("^User validates the error message\\.$")
	public void user_validates_the_error_message() throws Throwable {
//	 System.out.println("username and password not matched"); 
	}


}

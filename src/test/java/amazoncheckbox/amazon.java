package amazoncheckbox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class amazon 
{
	public WebDriver driver;
	@Given("^user is on amazon page$")
	public void user_is_on_amazon_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\sbatt\\\\Desktop\\\\Krishna Yash\\\\icloud-selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	    //throw new PendingException();
	}

	@When("^user enters dell in the search box$")
	public void user_enters_dell_in_the_search_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dell");
	    //throw new PendingException();
	}

	@When("^user clicks on search$")
	public void user_clicks_on_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("nav-input")).click();
	    //throw new PendingException();
	}

	@Then("^another page is displayed$")
	public void another_page_is_displayed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.findElement(By.id("sort_by_text")).isDisplayed());
//	    throw new PendingException();
	}

	@When("^user clicks on the checkbox$")
	public void user_clicks_on_the_checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(3000);
	   // throw new PendingException();
	}

	@Then("^user validates the checkbox$")
	public void user_validates_the_checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	    //throw new PendingException();
	}

}
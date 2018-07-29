package fblogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginFb {
	WebDriver driver;

	@FindBy(id="email")
	WebElement usrname;
	
	@FindBy(id="pass")
	WebElement pasword;
	
	@FindBy(id="loginbutton")
	WebElement loginbtn;
	
	public loginFb(WebDriver driver) {
		this.driver= driver;
	}
	
	public void loginmethod() {
		String p = driver.getTitle();
				System.out.println(p);
	}
	
	public void login(String username, String password) {
		usrname.sendKeys(username);
		pasword.sendKeys(password);
		loginbtn.click();
		
	}
	public void usrname(String username) {
		usrname.sendKeys(username);
		
		
	}
	public void pasword(String password) {
		pasword.sendKeys(password);
		
	}
	public void button() {
	
		loginbtn.click();
	}
	
}

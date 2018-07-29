package jnuitFb;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import fblogin.loginFb;
import junit.framework.Assert;

public class FbJunit {
 public static WebDriver driver;
 loginFb login = PageFactory.initElements(driver,loginFb.class);

 	@BeforeClass
 	public static void start() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sbatt\\Desktop\\Krishna Yash\\icloud-selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
 	@Test
 	public void test() {
// 		login.loginmethod();
 		login.login("hdbwhbdb", "pwdhwhhwhassword");
 	}
	@Test
 	public void test1() {
		String actual = driver.getTitle();
		String expected = "Facebook - Log In or Sign Up";
 		Assert.assertEquals(expected, actual);
 	}	
 	@AfterClass
	public static void teardown() {
//		driver.close();
	}
}

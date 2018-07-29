package com.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import fblogin.loginFb;

public class fbMain{
public static void setup(){
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sbatt\\Desktop\\Krishna Yash\\icloud-selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	loginFb login = PageFactory.initElements(driver,loginFb.class);
	login.loginmethod();
	login.login("somename", "somepassword");
}
public static void main(String[] args) {
	setup();
}
}
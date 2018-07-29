package ngBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class chrome {
	static WebDriver driver;
	@Parameters("browserName")
	@BeforeClass
	public void setup(String browserName)  {
		
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\sbatt\\\\Desktop\\\\Krishna Yash\\\\icloud-selenium\\\\geckodriver\\\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sbatt\\Desktop\\Krishna Yash\\icloud-selenium\\chromedriver_win32\\chromedriver.exe");
			//create chrome instance
			driver = new ChromeDriver();
		}
	}
		@Test
		public void invoke() {
			driver.get("https://www.amazon.com/");
	}
}

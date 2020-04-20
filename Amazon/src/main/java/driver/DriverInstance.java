package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverInstance{
	
	public static DriverInstance instance;
	WebDriver driver;
	WebDriverWait wait;
	
	@SuppressWarnings("deprecation")
	public DriverInstance(String browser){
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\selenium_server\\Driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.firefoxDriver.driver", "F:\\selenium_server\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		wait = new WebDriverWait(driver, 120);
	}
	
	public static void setInstance(String browser) {
		DriverInstance.instance = new DriverInstance(browser);
	}
	
	public static DriverInstance getInstance() {
		return instance;
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public WebDriverWait getWait() {
		return wait;
	}
	
	
}
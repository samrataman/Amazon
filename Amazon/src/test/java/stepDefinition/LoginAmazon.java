package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAmazon{
	
	WebDriver driver;
	WebDriverWait wait;
	
	static DriverInstance instance;
	{
		instance = DriverInstance.getInstance();
		driver = instance.getDriver();
		wait = instance.getWait();
	}
	
	@Given("user navigates to amazon web page")
	public void user_navigates_to_amazon_web_page() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	}

	@When("user clicks on Signin button")
	public void user_clicks_on_Signin_button() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-link-accountList")));
		
	}

	@Then("Amazon login page will open")
	public void amazon_login_page_will_open() {

	}
	
	
}
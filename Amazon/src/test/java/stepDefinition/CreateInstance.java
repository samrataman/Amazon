package stepDefinition;



import driver.DriverInstance;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class CreateInstance{
	
    public static String browserName = null;
	

	@Given("Browsere is {string}")
	public void browsere_is(String browser) {
	    // Write code here that turns the phrase above into concrete actions
		if(browserName == null) {
			System.out.println("hello: " +browser);
			DriverInstance.setInstance(browser);
			browserName = browser;
		}
		if(browserName!= null && browserName.equals(browser)) {
			DriverInstance.setInstance(browser);
			browserName = browser;
		}
	}

	@Before
	public void beforeScenario(Scenario sc) {
		System.out.println(sc.getName());
		System.out.println("Runs before all");
	}
	
	@After
	public void afterScenario(Scenario sc) {
		System.out.println(sc.getStatus());
	}
}
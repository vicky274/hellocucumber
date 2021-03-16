package stepDefinitions;

import java.io.IOException;
import java.lang.management.ManagementFactory;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;
import ExtentManager.BrowserFactory;


public class StepdefinitionTest {

	private WebDriver driver;
	private BrowserFactory BrowserFac;
	
	@Before
	public void beforescenario(Scenario scenario){
		System.out.println("Scenario Name :"+scenario.getName());
	}

	@When("i open the url {string}")
	public void i_open_the_url(String url) throws InterruptedException {
	 
		Thread.sleep(1000);
		System.out.println("Thread Id :"+Thread.currentThread().getId());
		
		
			try {
				BrowserFac = BrowserFactory.getinstance();
				BrowserFac.setup();
				this.driver = BrowserFac.getDriver();
				driver.get(url);
				Thread.sleep(1000);
				driver.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

	
	
	
}

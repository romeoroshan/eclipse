package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
	   
	 System.setProperty("webdriver.geko.marionette","C:\\Users\\ROG STRIX\\eclipse-workspace\\selenium\\src\\test\\resources\\files\\geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page()  throws Exception{
	   driver.navigate().to("http://localhost/Romeo/login.php");
	   Thread.sleep(2000);
	 
	}

	@When("user enters username and password")
	public void user_enters_username_and_password()  throws Throwable{
	   driver.findElement(By.id("admin_no")).sendKeys("661610");
	   driver.findElement(By.id("phone")).sendKeys("sb@ajce");
	 
	}

	@And("User clicks on login")
	public void user_clicks_on_login() {
	   driver.findElement(By.className("btn")).click();
	  
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws Exception{
	   driver.findElement(By.id("hd")).isDisplayed();
	   Thread.sleep(2000);
	   driver.close();
	   driver.quit();

	}

}

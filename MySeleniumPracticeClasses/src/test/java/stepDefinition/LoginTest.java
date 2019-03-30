package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	private static final String String = null;
	static WebDriver driver;
	//public static void main(String[] args) throws Throwable {
		/*open_the_Chrome_browser_and_start_the_application();
		i_enter_valid_name_and_valid_password();
		
		i_enter_invalid_name_and_invalid_password();
		user_should_be_able_to_login_successfully();*/
		
	

	@Given("^Open the Chrome browser and start the application$")
	public static void open_the_Chrome_browser_and_start_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjeet.panda\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();


	}

	@When("^I enter valid name	and valid password$")
	public static void i_enter_valid_name_and_valid_password() throws Throwable { 
		driver.findElement(By.id("email")).sendKeys("sanjeetpanda2014@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("rinky.123");

	}
	
	/*@When("^I enter invalid name and invalid password$")
	public static void i_enter_invalid_name_and_invalid_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("abcd@test.com");
		driver.findElement(By.id("pass")).sendKeys("rinky.123");*/
	    
	

	@Then("^User should be able to login successfully$")
	public  void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
	}

	
	


	}

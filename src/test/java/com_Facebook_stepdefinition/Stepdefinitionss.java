package com_Facebook_stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com_facebook_runner.Testrunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Stepdefinitionss {

	static WebDriver driver = Testrunner.driver;
	@Given("user Launch The Facebook Application Url")
	public void user_launch_the_facebook_application_url() throws InterruptedException {
	 
		driver.get("https://www.facebook.com/index.php/");
		Thread.sleep(2000);
		
	}
	@When("user Going To Enter The {string} In The Username Field")
	public void user_going_to_enter_the_in_the_username_field(String Username) throws InterruptedException {
		System.out.println("Entering username: " + Username);
	  driver.findElement(By.id("email")).sendKeys(Username);
	  Thread.sleep(2000);
	}
	@When("user Going To Enter THe {string} In The Password Field")
	public void user_going_to_enter_t_he_in_the_password_field(String Password) throws InterruptedException {
	
		driver.findElement(By.id("pass")).sendKeys(Password);
		Thread.sleep(5000);
		
	}
	@Then("user Click THe Log In Button And Navigate TO Next Page")
	public void user_click_t_he_log_in_button_and_navigate_to_next_page() {
	    
		driver.findElement(By.name("login")).click();
		Assert.assertEquals("Facebook", driver.getTitle());
		System.out.println(driver.getTitle());
		
	
	}
	
	
}

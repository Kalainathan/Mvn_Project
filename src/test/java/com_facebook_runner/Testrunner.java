package com_facebook_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\kalai\\Maven_project_6pm\\src\\test\\java\\com\\Facebook\\feature\\facebook.feature", glue = "com_Facebook_stepdefinition", 
publish = true, 
plugin = "html:Reports/Cucumber_Reports",
monochrome = true)

public class Testrunner {

	public static WebDriver driver;

	@BeforeClass
	public static void browserlaunch() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(2000);
		//driver.get("https://www.facebook.com/index.php/");
	}

	@AfterClass
	public static void close() {
		driver.close();
	}

}

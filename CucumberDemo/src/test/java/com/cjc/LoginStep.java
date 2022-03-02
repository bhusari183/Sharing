package com.cjc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	@Given("^User open \"(.*)\" browser$")
	public void operChrome(String browseropen)
	{
		
		if(browseropen.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\\\Chrome94\\\\chromedriver.exe");
			 Config.driver=new ChromeDriver();
		}
		else
		{
			System.out.println("IE");
		}
	}
	
	@And("^User enter application url \"(.*)/\"$")
	public void applicationUrl(String url)
	{
		Config.driver.get(url);
		System.out.println("open browser");
	}
	@When("^User pass the username value is\"(.*)\"$")
	public void userName(String unmae)
	{
		Config.driver.findElement(By.name("userName")).sendKeys(unmae);
		System.out.println("username");
	}
	
	@And("^User pass the password value is \"(.*)\"$")
	public void passWord(String pass)
	{
		Config.driver.findElement(By.name("password")).sendKeys(pass);
		System.out.println("password");
	}
	
	@And("^user click on submit button$")
	public void submitEnter()
	{
		Config.driver.findElement(By.name("submit")).click();
		System.out.println("submit");
	}
	
	@Then("^User we will able to see home page of application$")
	public void viewHomePage()
	{
		System.out.println("Welvome to homepage");
	}
}

package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinitions {
	WebDriver umar;
	@Given("^navigates to orangehm$")
	public void navigates_to_orangehm() throws Throwable {
		umar = new ChromeDriver();
		umar.manage().window().maximize();
		umar.get("http://orangehrm.qedgetech.com/");
	    Thread.sleep(2000);
	}

	@When("^user logs in using Username as \"([^\"]*)\"$")
	public void user_logs_in_using_Username_as(String username) throws Throwable {
	    umar.findElement(By.name("txtUsername")).sendKeys(username);
	}

	@When("^password as \"([^\"]*)\"$")
	public void password_as(String password) throws Throwable {
		umar.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
		umar.findElement(By.name("Submit")).click();
	}

	@Then("^user should validate  url text$")
	public void user_should_validate_url_text() throws Throwable {
	    String expected="dashboard";
	    String actual=umar.getCurrentUrl();
	    if(actual.contains(expected))
	    {
	    	System.out.println("Login sucess");
	    }
	    else
	    {
	    	System.out.println("Login fail");
	    }
	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
	    umar.close();
	}

}

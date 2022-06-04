package stepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class UserCreation {
	WebDriver uk;
	@Given("^User Launch Url in Browser$")
	public void user_Launch_Url_in_Browser() throws Throwable {
	    uk=new ChromeDriver();
	    uk.manage().deleteAllCookies();
	    uk.manage().window().maximize();
	    uk.get("http://orangehrm.qedgetech.com/");
	    Thread.sleep(4000);
	}

	@When("^I enter Username as \"([^\"]*)\"$")
	public void i_enter_Username_as(String username) throws Throwable {
	    uk.findElement(By.name("txtUsername")).sendKeys(username);
	}

	@When("^I Enter Password as\"([^\"]*)\"$")
	public void i_Enter_Password_as(String password) throws Throwable {
		uk.findElement(By.name("txtPassword")).sendKeys(password);
	
	}

	@When("^i click login button$")
	public void i_click_login_button() throws Throwable {
		uk.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
	}

	@When("^I click Admin$")
	public void i_click_Admin() throws Throwable {
		uk.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		Thread.sleep(4000);
	}

	@When("^I click AddBtn$")
	public void i_click_AddBtn() throws Throwable {
		uk.findElement(By.name("btnAdd")).click();
		Thread.sleep(4000);
	}

	@When("^i Select \"([^\"]*)\" in user role$")
	public void i_Select_in_user_role(String userRole) throws Throwable {
	    new Select(uk.findElement(By.name("systemUser[userType]"))).selectByVisibleText(userRole);
	}

	@When("^i Enter \"([^\"]*)\" in ename$")
	public void i_Enter_in_ename(String Ename) throws Throwable {
		uk.findElement(By.name("systemUser[employeeName][empName]")).sendKeys(Ename);
	}

	@When("^I Enter \"([^\"]*)\" in username$")
	public void i_Enter_in_username(String user) throws Throwable {
		uk.findElement(By.name("systemUser[userName]")).sendKeys(user);
	}

	@When("^I Enter \"([^\"]*)\" in password$")
	public void i_Enter_in_password(String pass) throws Throwable {
		uk.findElement(By.name("systemUser[password]")).sendKeys(pass);
	}

	@When("^I Enter \"([^\"]*)\" in cpassword$")
	public void i_Enter_in_cpassword(String cpass) throws Throwable {
		uk.findElement(By.name("systemUser[confirmPassword]")).sendKeys(cpass);
	}

	@When("^I click on save button$")
	public void i_click_on_save_button() throws Throwable {
		uk.findElement(By.name("btnSave")).click();
		Thread.sleep(4000);
	}

	@Then("^I vallidate Url$")
	public void i_vallidate_Url() throws Throwable {
	    String expected="viewSystemUsers";
	    String actual=uk.getCurrentUrl();
	    if(actual.contains(expected))
	    {
	    	System.out.println("Add user sucess");
	    }
	    else
	    {
	    	System.out.println("Add user fail");
	    }
	}

	@Then("^I close Browser$")
	public void i_close_Browser() throws Throwable {
	    uk.close();
	}

}

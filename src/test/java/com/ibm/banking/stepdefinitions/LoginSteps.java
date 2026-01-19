package com.ibm.banking.stepdefinitions;

import org.testng.Assert;

import com.ibm.banking.pages.DashboardPage;
import com.ibm.banking.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	
	@Given("the user is on the TDDBank login page")
	public void user_is_on_login_page() {
		loginPage = new LoginPage();
		loginPage.open();
	}
	
	@When("the user logs in using email {string} and password {string}")
	public void user_logs_in_With_credentials(String email,String password) {
		loginPage.login(email, password);
	}
	
	@Then("the user should be redirected to the dashboard")
	public void user_should_be_redirected_to_dashboard() {
        dashboardPage = new DashboardPage();
        Assert.assertTrue(
                dashboardPage.isDashboardDisplayed(),
                "Dashboard was not displayed after login"
        );
	}	
}

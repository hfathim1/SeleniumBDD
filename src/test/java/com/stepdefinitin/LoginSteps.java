package com.stepdefinitin;

import com.base.BaseTest;
import com.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;

public class LoginSteps extends BaseTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp() {
        super.setUp();
        driver = BaseTest.driver;
        loginPage = new LoginPage(driver);
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get("https://www.google.com");
    }

    @When("I enter a valid username and password")
    public void i_enter_a_valid_username_and_password() {
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password");
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("I should be redirected to the home page")
    public void i_should_be_redirected_to_the_home_page() {
        // Implement a check to verify redirection
    }

    @After
    public void tearDown() {
        super.tearDown();
    }
}

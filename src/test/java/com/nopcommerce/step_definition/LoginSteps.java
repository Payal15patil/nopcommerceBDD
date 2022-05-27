package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class LoginSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    LoginPage loginPage = new LoginPage();

    @Then("^I should see \"([^\"]*)\" text on login page$")
    public void i_should_see_text_on_login_page(String expectedMessage) throws Throwable {
        String actualMessage = loginPage.loginPageTitle();
        assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));

    }

    @Then("^the url should contain with \"([^\"]*)\"$")
    public void the_url_should_contain_with(String expectedUrl) throws Throwable {
        String actualUrl = driverManager.getUrl();
        assertThat(actualUrl, containsString(expectedUrl));

    }
    @When("^I enter emailId and password$")
    public void i_enter_emailId_and_password() throws Throwable {
       loginPage.enterEmailAndPassword();
    }

    @When("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
        loginPage.submitLoginDetails();
    }

    @Then("^I should see Log out on header$")
    public void i_should_see_Log_out_on_header() throws Throwable {
       loginPage.clickOnLogout();
    }


}

package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.HomePage;
import com.nopcommerce.page.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class RegistrationSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    RegisterPage registerPage = new RegisterPage();

    @Given("^I select gender$")
    public void i_select_gender() throws Throwable {
        registerPage.selectGender();
    }

    @Given("^I enter First Name$")
    public void i_enter_First_Name() throws Throwable {
        registerPage.enterFirstName();
    }

    @Given("^I enter Last Name$")
    public void i_enter_Last_Name() throws Throwable {
        registerPage.enterLastName();
    }

    @Given("^I enter email$")
    public void i_enter_email() throws Throwable {
        registerPage.enterEmail();
    }

    @Given("^I enter Password$")
    public void i_enter_Password() throws Throwable {
        registerPage.enterPassword();
    }

    @Given("^I enter Confirm Password$")
    public void i_enter_Confirm_Password() throws Throwable {
        registerPage.enterConfirmPassword();
    }



    @When("^I click on Register Button$")
    public void i_click_on_Register_Button() throws Throwable {
        registerPage.clickOnRegister();
    }

    @Then("^I should see \"([^\"]*)\" message$")
    public void i_should_see_message(String message2) throws Throwable {
        String message1 = registerPage.registerMessage();
        assertThat(message1,is(equalToIgnoringCase(message2)));

    }

    @Then("^I should see My account on header$")
    public void i_should_see_My_account_on_header() throws Throwable {
        registerPage.myAccountButtonOnHeader();
    }

}

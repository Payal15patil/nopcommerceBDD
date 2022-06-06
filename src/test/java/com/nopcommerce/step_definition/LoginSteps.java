package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.JeweleryPage;
import com.nopcommerce.page.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
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



    @And("^I enter emailId \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterEmailIdAndPassword(String myEmail, String myPassword) throws Throwable {
       loginPage.enterEmailAndPassword(myEmail,myPassword);
    }

    @When("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
        loginPage.submitLoginDetails();
    }


}

package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.HomePage;
import com.nopcommerce.page.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HomeSteps extends DriverManager {
   DriverManager driverManager = new DriverManager();
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
       String myUrl = driverManager.getUrl();
        System.out.println(myUrl);
        assertThat(myUrl,is(endsWith("nopcommerce.com/")));
    }
    @When("^I click on the Log in$")
    public void i_click_on_the_Log_in() throws Throwable {
        homePage.clickLoginButton();
    }

    @Given("^I click on the register$")
    public void i_click_on_the_register() throws Throwable {
    homePage.registerOnHeader();
    }

    @Given("^I scroll down to footer$")
    public void i_scroll_down_to_footer() throws Throwable {
     homePage.scrollToPrivacyText();
    }

    @When("^I click on privacy policy$")
    public void i_click_on_privacy_policy() throws Throwable {
     homePage.clickOnPrivacyPolicy();
    }

    @Then("^I take screenshot of search field$")
    public void iTakeScreenshotOfSearchField() throws IOException {
     homePage.takeSearchFieldScreenshot();
    }

    @When("^I click on Contact Us$")
    public void i_click_on_Contact_Us() throws Throwable {
     homePage.clickOnContactUs();
    }

    @Given("^I scroll down to community poll$")
    public void i_scroll_down_to_community_poll() throws Throwable {
     homePage.scrollToCommunityPollText();
    }

    @Given("^I select good option for do you like nopcommerce\\?$")
    public void i_select_good_option_for_do_you_like_nopcommerce() throws Throwable {
     homePage.clickSecondOptionInCommunityPoll();
    }

    @When("^I select vote button on home page$")
    public void i_select_vote_button_on_home_page() throws Throwable {
     homePage.clickOnVoteButton();
    }


    @Given("^I enter \"([^\"]*)\" in search box$")
    public void i_enter_in_search_box(String arg1) throws Throwable {
     homePage.enterTextInSearchBox();
    }

    @Given("^I click on search$")
    public void i_click_on_search() throws Throwable {
     homePage.clickOnSearch();
    }

    @Given("^I hover on sub categories of apparel$")
    public void i_hover_on_sub_categories_of_apparel() throws Throwable {
     homePage.moveToApparelCategory();
    }

    @Given("^I click on Accessories$")
    public void i_click_on_Accessories() throws Throwable {
     homePage.clickOnAccessories();
    }

}

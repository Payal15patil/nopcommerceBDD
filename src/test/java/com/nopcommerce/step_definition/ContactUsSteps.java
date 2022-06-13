package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.ContactUsPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.checkerframework.checker.units.qual.C;

import java.util.List;
import java.util.Map;

public class ContactUsSteps extends DriverManager {
    ContactUsPage contactUsPage = new ContactUsPage();

    @When("^I enter following details on Contact Us page$")
    public void i_enter_following_details_on_Contact_Us_page(DataTable contactUsTable) throws Throwable {
        List<Map<String, String>> data = contactUsTable.asMaps(String.class, String.class);
        System.out.println(data);
        contactUsPage.enterNameForContactUs(data.get(0).get("name"));
        contactUsPage.enterEmailForContactUs(data.get(0).get("email"));
        contactUsPage.enterEnquiryForContactUs(data.get(0).get("enquiry"));
    }

    @Then("^I click on submit button$")
    public void i_click_on_submit_button() throws Throwable {
        contactUsPage.clickOnSubmitButton();
    }
}

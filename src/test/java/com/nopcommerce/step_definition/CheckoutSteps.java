package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.CheckoutPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;
import java.util.Map;

public class CheckoutSteps extends DriverManager {
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("^I enter following details on checkout page in Billing Address$")
    public void i_enter_following_details_on_checkout_page_in_Billing_Address(DataTable billingAddressDataTable) throws Throwable {
        List<Map<String, String>> data = billingAddressDataTable.asMaps(String.class, String.class);
        System.out.println(data);
        checkoutPage.enterCountryName(data.get(0).get("country"));
        checkoutPage.enterCityName(data.get(0).get("city"));
        checkoutPage.enterAddress(data.get(0).get("address1"));
        checkoutPage.enterPostcode(data.get(0).get("postcode"));
        checkoutPage.enterPhoneNumber(data.get(0).get("phoneNumber"));

    }

    @Given("^I click on continue button$")
    public void i_click_on_continue_button() throws Throwable {
        checkoutPage.clickOnContinueButton();
    }
    @Then("^I select Next Day Air option in shipping method$")
    public void i_select_Next_Day_Air_option_in_shipping_method() throws Throwable {
        checkoutPage.selectShippingOption();
    }

    @Then("^I click on continue button of shipping method$")
    public void i_click_on_continue_button_of_shipping_method() throws Throwable {
        checkoutPage.clickOnShippingContinueButton();
    }

    @Then("^I select Check/Money order option in payment method$")
    public void i_select_Check_Money_order_option_in_payment_method() throws Throwable {
        checkoutPage.selectCheckOption();
    }

    @Then("^I select Credit Card option in payment method$")
    public void i_select_Credit_Card_option_in_payment_method() throws Throwable {
        checkoutPage.selectCreditCardOption();
    }

    @Then("^I click on continue button of payment method$")
    public void i_click_on_continue_button_of_payment_method() throws Throwable {
        checkoutPage.clickOnPaymentContinueButton();
    }

    @Then("^I enter following details on checkout page in Payment Information$")
    public void i_enter_following_details_on_checkout_page_in_Payment_Information(DataTable creditCardData) throws Throwable {
        List<Map<String, String>> data = creditCardData.asMaps(String.class, String.class);
        System.out.println(data);
        checkoutPage.selectCreditCardType(data.get(0).get("cardType"));
        checkoutPage.enterCardHolderName(data.get(0).get("cardholderName"));
        checkoutPage.enterCardNumber(data.get(0).get("cardNumber"));
        checkoutPage.enterCardExpiryDate(data.get(0).get("expiryDate"));
        checkoutPage.enterCardCode(data.get(0).get("cardCode"));
    }

    @Then("^I click on continue button of payment information$")
    public void i_click_on_continue_button_of_payment_information() throws Throwable {
        checkoutPage.clickOnPaymentInfoContinueButton();
    }

    @Then("^I click on confirm button on checkout page$")
    public void i_click_on_confirm_button_on_checkout_page() throws Throwable {
        checkoutPage.clickOnConfirmButton();
    }



}

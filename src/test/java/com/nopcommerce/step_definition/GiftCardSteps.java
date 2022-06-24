package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.GiftCardPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GiftCardSteps extends DriverManager {
    GiftCardPage giftCardPage = new GiftCardPage();

    @Given("^I click on \"([^\"]*)\" product on gift cards page$")
    public void i_click_on_product_on_gift_cards_page(String arg1) throws Throwable {
     giftCardPage.clickOnProduct();
    }
}

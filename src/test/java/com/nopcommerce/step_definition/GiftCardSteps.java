package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.GiftCardPage;
import cucumber.api.java.en.When;

public class GiftCardSteps extends DriverManager {
    GiftCardPage giftCardPage = new GiftCardPage();

    @When("^I click on Add your review on (\\d+)-virtual-gift-card page$")
    public void i_click_on_Add_your_review_on_virtual_gift_card_page(int arg1) throws Throwable {
        giftCardPage.clickOnAddToReviewText();
    }
}

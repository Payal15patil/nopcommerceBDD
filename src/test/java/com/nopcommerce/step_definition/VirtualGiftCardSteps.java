package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.VirtualGiftCardPage;
import cucumber.api.java.en.Given;

public class VirtualGiftCardSteps extends DriverManager {
    VirtualGiftCardPage virtualGiftCardPage = new VirtualGiftCardPage();

    @Given("^I click on Add your review on \\$(\\d+)-virtual-gift-card page$")
    public void i_click_on_Add_your_review_on_$_virtual_gift_card_page(int review) throws Throwable {
        virtualGiftCardPage.clickOnAddToReview();
    }
}

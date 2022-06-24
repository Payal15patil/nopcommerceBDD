package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.ProductReviewPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class ProductReviewSteps extends DriverManager {
    ProductReviewPage productReviewPage = new ProductReviewPage();

    @Given("^I enter following details on product review page$")
    public void i_enter_following_details_on_product_review_page(DataTable productReviewTable) throws Throwable {
        List<Map<String, String>> data = productReviewTable.asMaps(String.class, String.class);
        System.out.println(data);
        productReviewPage.enterReviewTitle(data.get(0).get("title"));
        productReviewPage.enterReviewText(data.get(0).get("text"));
    }

    @Given("^I select excellent radio button for rating$")
    public void i_select_excellent_radio_button_for_rating() throws Throwable {
        productReviewPage.selectRatingRadioButton();
    }

    @When("^I click on submit review button$")
    public void i_click_on_submit_review_button() throws Throwable {
        productReviewPage.clickOnSubmitReviewButton();
    }

}

package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.CheckoutCompletedPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CheckoutCompletedSteps extends DriverManager {
    CheckoutCompletedPage checkoutCompletedPage = new CheckoutCompletedPage();

    @Then("^I should see order number$")
    public void i_should_see_order_number() throws Throwable {
     String myOrderNumber = "checkoutCompletedPage.getOrderNumber()";
        System.out.println(myOrderNumber);
    }

//    @Then("^I click on \"([^\"]*)\" link$")
//    public void i_click_on_link(String givenLink) throws Throwable {
//       checkoutCompletedPage.givenLinkOnCheckoutCompletedPage();
//    }
}

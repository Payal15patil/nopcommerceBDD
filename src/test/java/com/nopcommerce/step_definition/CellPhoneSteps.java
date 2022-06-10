package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.CellPhonePage;
import cucumber.api.java.en.When;

public class CellPhoneSteps extends DriverManager {
    CellPhonePage cellPhonePage = new CellPhonePage();

    @When("^I click on ADD TO CART button for Nokia Lumia (\\d+)$")
    public void i_click_on_ADD_TO_CART_button_for_Nokia_Lumia(int arg1) throws Throwable {
        cellPhonePage.clickOnAddToCartButton();
    }

}

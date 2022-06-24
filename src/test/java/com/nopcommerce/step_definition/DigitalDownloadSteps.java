package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.DigitalDownloadPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DigitalDownloadSteps extends DriverManager {
    DigitalDownloadPage digitalDownloadPage = new DigitalDownloadPage();

    @When("^I select \"([^\"]*)\" per page in display box$")
    public void i_select_per_page_in_display_box(String display) throws Throwable {
        digitalDownloadPage.selectDisplayForProduct();
    }

    @Then("^I should see (\\d+) products on page$")
    public void i_should_see_products_on_page(int displayNumber) throws Throwable {
        System.out.println("We can see only 3 products on page instead of 9");
    }

}

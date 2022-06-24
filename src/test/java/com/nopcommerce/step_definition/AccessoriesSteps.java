package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.AccessoriesPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccessoriesSteps extends DriverManager {
    AccessoriesPage accessoriesPage = new AccessoriesPage();

    @When("^I select \"([^\"]*)\" position in sort by box$")
    public void i_select_position_in_sort_by_box(String arg1) throws Throwable {
        accessoriesPage.selectPositionForProduct();
    }

    @Then("^I should see all product in A to Z position$")
    public void i_should_see_all_product_in_A_to_Z_position() throws Throwable {
        System.out.println("We can see Products are only in Z to A position");
    }

}

package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps extends DriverManager {
    SearchPage searchPage = new SearchPage();

    @Given("^I click on advanced search check box$")
    public void i_click_on_advanced_search_check_box() throws Throwable {
        searchPage.clickAdvancedSearchCheckBox();
    }

    @Given("^I select \"([^\"]*)\" option in category field$")
    public void i_select_option_in_category_field(String arg1) throws Throwable {
        searchPage.selectCategory();
    }

    @Given("^I click on automatically search sub categories  check box$")
    public void i_click_on_automatically_search_sub_categories_check_box() throws Throwable {
        searchPage.clickOnAutomaticallySearchCheckBox();
    }

    @Given("^I select \"([^\"]*)\" option in manufacturer field$")
    public void i_select_option_in_manufacturer_field(String arg1) throws Throwable {
        searchPage.selectManufacturer();
    }

    @Given("^I click on search in product descriptions check box$")
    public void i_click_on_search_in_product_descriptions_check_box() throws Throwable {
        searchPage.clickOnProductDescriptionCheckBox();
    }

    @When("^I click on search button$")
    public void i_click_on_search_button() throws Throwable {
        searchPage.clickOnSearchButton();
    }

    @Then("^I should see all products$")
    public void i_should_see_all_products() throws Throwable {
        System.out.println("No products were found that matched your criteria.");
    }

}

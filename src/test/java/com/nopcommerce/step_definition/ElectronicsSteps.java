package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.ElectronicsPage;
import cucumber.api.java.en.When;

import javax.swing.*;

public class ElectronicsSteps extends DriverManager {
    ElectronicsPage electronicsPage = new ElectronicsPage();

    @When("^I click on cell phones from electronics page$")
    public void i_click_on_cell_phones_from_electronics_page() throws Throwable {
        electronicsPage.clickOnCellPhonesOption();
    }
}

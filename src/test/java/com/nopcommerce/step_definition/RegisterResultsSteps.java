package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.HomePage;
import com.nopcommerce.page.RegisterPage;
import com.nopcommerce.page.RegisterResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Ru;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

import java.rmi.registry.Registry;

public class RegisterResultsSteps extends DriverManager {

    RegisterResultPage registerResultPage = new RegisterResultPage();
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();

    @Given("^I click on continue button on register/result page$")
    public void i_click_on_continue_button_on_register_result_page() throws Throwable {
        registerResultPage.clickContinueButton();
    }

    @Then("^I should see My account on header$")
    public void i_should_see_My_account_on_header() throws Throwable {
        registerResultPage.myAccountButtonOnHeader();
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String category) throws Throwable {
        switch (category){
            case "jewelery":
                registerResultPage.clickOnJewelery();
                System.out.println("You are in Jewelery category");
                break;
            case "electronics":
                registerResultPage.clickOnElectronics();
                System.out.println("You are in Electronics category");
                break;
            case "giftcards":
                registerPage.clickOnGiftCards();
                System.out.println("You are in Gift Cards category");
                break;
            case "digitaldownloads":
                homePage.clickOnDigitalDownload();
                System.out.println("You are in Digital Downloads category");
                break;
        }
    }

    @And("^I click on logout on register/result page$")
    public void iClickOnLogoutOnRegisterResultPage() {
        registerResultPage.clickOnLogoutButton();
    }
}

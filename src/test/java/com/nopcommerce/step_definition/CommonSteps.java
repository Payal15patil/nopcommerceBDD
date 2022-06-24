package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class CommonSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    CheckoutCompletedPage checkoutCompletedPage = new CheckoutCompletedPage();
    ContactUsPage contactUsPage = new ContactUsPage();
    ProductReviewPage productReviewPage = new ProductReviewPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();

    @Then("^I should see \"([^\"]*)\" text on \"([^\"]*)\" page$")
    public void iShouldSeeTextOnPage(String expectedText, String pageType1) throws Throwable {
        switch (pageType1){
            case "login":
                String actualMessage = loginPage.loginPageTitle();
                System.out.println(actualMessage);
                System.out.println(expectedText);
                assertThat(actualMessage,is(equalToIgnoringCase(expectedText)));
                break;
            case "registration":
                String message1 = registerResultPage.registerMessage();
                System.out.println(message1);
                System.out.println(expectedText);
                assertThat(message1,is(equalToIgnoringCase(expectedText)));
                break;
            case "checkout/completed":
                String message2 = checkoutCompletedPage.messageOnCheckoutCompletedPage();
                System.out.println(message2);
                System.out.println(expectedText);
                assertThat(message2,is(equalToIgnoringCase(expectedText)));
                break;
            case "contactus":
                String message3 = contactUsPage.getResultTextOnContactUsPage();
                System.out.println(message3);
                System.out.println(expectedText);
                assertThat(message3,is(equalToIgnoringCase(expectedText)));
                break;
            case "home":
                String message4 = homePage.voteTextOnHomePage();
                System.out.println(message4);
                System.out.println(expectedText);
                assertThat(message4,is(equalToIgnoringCase(expectedText)));
                break;
            case "productreview":
                String message5 = productReviewPage.getTextOnProductReviewPage();
                System.out.println(message5);
                System.out.println(expectedText);
                assertThat(message5,is(equalToIgnoringCase(expectedText)));
                break;
        }
    }

    @And("^the url should contain with \"([^\"]*)\"$")
    public void theUrlShouldContainWith(String expectedUrl) throws Throwable {
        switch (expectedUrl){
            case "/login":
                String actualUrlForLogin = driverManager.getUrl();
                System.out.println(actualUrlForLogin);
                assertThat(actualUrlForLogin,containsString(expectedUrl));
                System.out.println(expectedUrl);
            case "/registerresult":
                String actualUrlForRegistration = driverManager.getUrl();
                System.out.println(actualUrlForRegistration);
                assertThat(actualUrlForRegistration,containsString(expectedUrl));
                System.out.println(expectedUrl);
        }
    }



}

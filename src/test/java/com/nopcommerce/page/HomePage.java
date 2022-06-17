package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.io.IOException;

public class HomePage extends DriverManager {
    DriverManager driverManager = new DriverManager();

    @FindBy(className = "ico-login")
    WebElement loginButtonOnHeader;

    @FindBy(linkText = "Register")
    WebElement clickRegisterOnHeader;

    @FindBy(linkText = "Privacy notice")
    WebElement privacyText;

    @FindBy(id = "small-searchterms")
    private WebElement searchInputField;

    @FindBy(linkText = "Contact us")
    WebElement contactUs;

    @FindBy(className = "title")
    WebElement communityPoll;

    @FindBy(id = "pollanswers-2")
    WebElement clickOptionGood;

    @FindBy(id = "vote-poll-1")
    WebElement voteButton;

    @FindBy(id = "block-poll-vote-error-1")
    WebElement voteText;

    @FindBy(id = "small-searchterms")
    WebElement searchItemsBox;

    @FindBy(linkText = "Search")
    WebElement clickSearch;

    public void clickLoginButton(){
        waitUntilElementIsVisible(loginButtonOnHeader,20,"Login Button is not visible");
        loginButtonOnHeader.click();
    }

    public void registerOnHeader(){
        clickRegisterOnHeader.click();
    }

    public void scrollToPrivacyText(){
        driverManager.scrollTo(privacyText);
    }

    public void clickOnPrivacyPolicy(){
        privacyText.click();
    }
    public void takeSearchFieldScreenshot() throws IOException {
        takeElementScreenshot(searchInputField, "search");
    }
    public void clickOnContactUs(){
       contactUs.click();
    }

    public void scrollToCommunityPollText(){
        driverManager.scrollTo(communityPoll);
    }

    public void clickSecondOptionInCommunityPoll(){
        clickOptionGood.click();
    }

    public void clickOnVoteButton(){
        voteButton.click();
    }

    public String voteTextOnHomePage(){
        return voteText.getText();
    }

    public void enterTextInSearchBox(){
        searchItemsBox.sendKeys("Electronics");
    }

    public void clickOnSearch(){
        clickSearch.click();
    }
}

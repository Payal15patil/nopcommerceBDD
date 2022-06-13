package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    WebElement featuredProductsTitle;

    @FindBy(linkText = "$25 Virtual Gift Card")
    WebElement clickOnProduct;

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

    public void scrollToFeaturedProducts(){
        driverManager.scrollTo(featuredProductsTitle);
    }

    public void clickOnGiftCardProduct(){
        clickOnProduct.click();
    }

}

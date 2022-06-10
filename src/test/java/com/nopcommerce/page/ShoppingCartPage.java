package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static com.nopcommerce.driver.DriverManager.driver;

public class ShoppingCartPage extends DriverManager {

    @FindBy(id = "checkout_attribute_1")
    WebElement giftWrapOption;

    @FindBy(id = "termsofservice")
    WebElement termsAndConditions;

    @FindBy(name = "checkout")
    WebElement checkoutButton;

    public void selectGiftWrapping(){
        Select select = new Select(giftWrapOption);
        select.selectByIndex(1);
    }

    public void selectTermsAndConditions(){
        termsAndConditions.click();
    }

    public void clickOnCheckoutButton(){
        checkoutButton.click();
    }
}

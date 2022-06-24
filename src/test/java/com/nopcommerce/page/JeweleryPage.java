package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JeweleryPage extends DriverManager {


    @FindBy(className = "button-2 product-box-add-to-cart-button")
    WebElement addToCartButton;

    @FindBy(linkText = "Shopping cart")
    WebElement shoppingCart;

    public void clickOnAddToCart(){
        addToCartButton.click();
    }

    public void clickOnShoppingCart(){
        shoppingCart.click();
    }
}

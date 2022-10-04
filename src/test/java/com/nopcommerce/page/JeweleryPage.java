package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JeweleryPage extends DriverManager {

    @FindBy(linkText = "Add to cart")
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

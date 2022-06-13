package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardPage extends DriverManager {

    @FindBy(linkText = "Add your review")
    WebElement addToReviewText;

    public void clickOnAddToReviewText(){
        addToReviewText.click();
    }
}

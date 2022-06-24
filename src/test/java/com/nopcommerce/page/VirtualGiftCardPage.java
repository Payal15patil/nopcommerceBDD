package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VirtualGiftCardPage extends DriverManager {

    @FindBy(linkText = "Add your review")
    WebElement addToReview;

    public void clickOnAddToReview(){
        addToReview.click();
    }
}

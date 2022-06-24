package com.nopcommerce.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductReviewPage {

    @FindBy(id = "AddProductReview_Title")
    WebElement reviewTitle;

    @FindBy(id = "AddProductReview_ReviewText")
    WebElement reviewText;

    @FindBy(id = "addproductrating_4")
    WebElement radioButton4;

    @FindBy(name = "add-review")
    WebElement submitReviewButton;

    @FindBy(className = "result")
    WebElement productReviewText;

    public void enterReviewTitle(String title){
        reviewTitle.sendKeys(title);
    }
    public void enterReviewText(String text){
        reviewText.sendKeys(text);
    }
    public void selectRatingRadioButton(){
        radioButton4.click();
    }
    public void clickOnSubmitReviewButton(){
        submitReviewButton.click();
    }
    public String getTextOnProductReviewPage(){
        return productReviewText.getText();
    }
}

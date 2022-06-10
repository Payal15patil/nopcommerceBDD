package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletedPage extends DriverManager {

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")
    WebElement checkoutCompletedMessage;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a")
    WebElement link;

    @FindBy(className = "order-number")
    WebElement orderNumber;

    public String messageOnCheckoutCompletedPage(){
        return checkoutCompletedMessage.getText();
    }

    public void givenLinkOnCheckoutCompletedPage(){
        link.click();
    }

    public void getOrderNumber(){
        orderNumber.getText();
    }

}

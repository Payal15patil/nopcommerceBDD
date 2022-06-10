package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetailsPage extends DriverManager {

    @FindBy(linkText = "Print")
    WebElement printButton;

    public void clickOnPrintButton(){
        printButton.click();
    }
}

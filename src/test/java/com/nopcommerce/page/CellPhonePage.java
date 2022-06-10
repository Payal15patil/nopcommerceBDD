package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CellPhonePage extends DriverManager {
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCartForNokia;

    public void clickOnAddToCartButton(){
        addToCartForNokia.click();
    }
}

package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import cucumber.api.java.ca.I;
import cucumber.api.java.cs.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccessoriesPage extends DriverManager {

    @FindBy(id = "products-orderby")
    WebElement position;

    public void selectPositionForProduct(){
        Select selectPosition = new Select(position);
        selectPosition.selectByIndex(1);
    }
}

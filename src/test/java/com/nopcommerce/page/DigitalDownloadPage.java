package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class DigitalDownloadPage extends DriverManager {

    @FindBy(id = "products-pagesize")
    WebElement display;

    public void selectDisplayForProduct(){
       Select selectDisplay = new Select(display);
       selectDisplay.selectByVisibleText("6");
    }
}

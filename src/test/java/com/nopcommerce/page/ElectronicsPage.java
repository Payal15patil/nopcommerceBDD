package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends DriverManager {

    @FindBy(linkText = "Cell phones")
    WebElement cellPhones;

    public void clickOnCellPhonesOption(){
        cellPhones.click();
    }
}

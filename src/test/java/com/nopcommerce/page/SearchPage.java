package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends DriverManager {

    @FindBy(id = "advs")
    WebElement advancedSearchBox;

    @FindBy(id = "cid")
    WebElement category;

    @FindBy(id = "isc")
    WebElement subCategoryBox;

    @FindBy(id = "mid")
    WebElement manufacturer;

    @FindBy(id = "sid")
    WebElement productDescriptionsBox;

    @FindBy(linkText = "Search")
    WebElement searchButton;

    public void clickAdvancedSearchCheckBox(){
        advancedSearchBox.click();
    }

    public void selectCategory(){
        Select selectCat = new Select(category);
        selectCat.selectByIndex(7);
    }

    public void clickOnAutomaticallySearchCheckBox(){
        subCategoryBox.click();
    }

    public void selectManufacturer(){
        Select selectManu = new Select(manufacturer);
        selectManu.selectByIndex(0);
    }

    public void clickOnProductDescriptionCheckBox(){
        productDescriptionsBox.click();
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }
}

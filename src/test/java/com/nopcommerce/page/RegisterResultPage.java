package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterResultPage extends DriverManager {

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")
    WebElement continueButton;

    @FindBy(className = "ico-logout")
    WebElement logoutButton;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
    WebElement messageOnRegisterResult;

    @FindBy(linkText = "My account")
    WebElement myAccount;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[6]/a")
    WebElement jewelery;

    @FindBy(linkText = "Electronics")
    WebElement electronics;

    public void clickContinueButton(){
        continueButton.click();
    }

    public void clickOnLogoutButton(){
        logoutButton.click();
    }

    public String registerMessage(){
        return messageOnRegisterResult.getText();
    }

    public void myAccountButtonOnHeader(){
        myAccount.isDisplayed();
    }

    public void clickOnJewelery(){
        jewelery.click();
    }

    public void clickOnElectronics(){
        electronics.click();
    }
}

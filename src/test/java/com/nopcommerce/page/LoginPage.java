package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class LoginPage extends DriverManager {
    DriverManager driverManager = new DriverManager();

    @FindBy(css = ".page-title1")
    WebElement titleName;

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    WebElement clickLogin;

    public String loginPageTitle(){
        return titleName.getText();
    }

    public void enterEmailAndPassword(String myEmail, String myPassword){
        int myRandomNumber = driverManager.generateRandomNumber();
        email.clear();
        email.sendKeys(myEmail);
//        email.sendKeys(myRandomNumber+myEmail);
//        password.clear();
        password.sendKeys(myPassword);
//        password.sendKeys(myRandomNumber+myPassword);
    }

    public void submitLoginDetails(){
        clickLogin.click();
    }


}

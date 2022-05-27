package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class LoginPage extends DriverManager {
DriverManager driverManager = new DriverManager();

    @FindBy(css = ".page-title")
    WebElement titleName;

    public String loginPageTitle(){
        return titleName.getText();
    }

    @FindBy(id = "Email")
    WebElement email;
    @FindBy(id = "Password")
    WebElement password;

    public void enterEmailAndPassword(){
        email.sendKeys("yogipatel@gmail.com");
        password.sendKeys("22992299");
    }
    @FindBy(linkText = "Log in")
    WebElement clickLogin;

    public void submitLoginDetails(){
        clickLogin.click();
    }

    @FindBy(linkText = "Log out")
    WebElement logoutButton;

    public void clickOnLogout(){
        logoutButton.click();
    }

}

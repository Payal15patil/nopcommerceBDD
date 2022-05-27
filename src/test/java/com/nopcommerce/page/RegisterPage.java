package com.nopcommerce.page;

import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Level;

public class RegisterPage {

    @FindBy(id = "gender-female")
    WebElement gender;
    public void selectGender(){
        gender.click();
    }

    @FindBy(id = "FirstName")
    WebElement firstName;
    public void enterFirstName(){
        firstName.sendKeys("pinkal");
    }

    @FindBy(id = "LastName")
    WebElement lastName;
    public void enterLastName(){
        lastName.sendKeys("patel");
    }

    @FindBy(id = "Email")
    WebElement emailID;
    public void enterEmail(){
        emailID.sendKeys("pinkalpatel24@gmail.com");
    }

    @FindBy(id = "Password")
    WebElement password;
    public void enterPassword(){
        password.sendKeys("245245");
    }

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    public void enterConfirmPassword(){
        confirmPassword.sendKeys(password.getText());
    }

    @FindBy(id = "register-button")
    WebElement registerButton;
    public void clickOnRegister(){
        registerButton.submit();
    }

    @FindBy(linkText = "Your registration completed")
    WebElement messageOnRegisterResult;
    public String registerMessage(){
       return messageOnRegisterResult.getText();
    }

    @FindBy(linkText = "My account")
    WebElement myAccount;
    public void myAccountButtonOnHeader(){
    }

}

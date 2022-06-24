package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends DriverManager {
    DriverManager driverManager = new DriverManager();

    @FindBy(id = "gender-female")
    WebElement myGender;

    @FindBy(id = "FirstName")
    WebElement myFirstName;

    @FindBy(id = "LastName")
    WebElement myLastName;

    @FindBy(name = "DateOfBirthDay")
    WebElement birthDay;

    @FindBy(name = "DateOfBirthMonth")
    WebElement birthMonth;

    @FindBy(name = "DateOfBirthYear")
    WebElement birthYear;

    @FindBy(id = "Email")
    WebElement emailID;

    @FindBy(id = "Password")
    WebElement myPassword;

    @FindBy(id = "ConfirmPassword")
    WebElement myConfirmPassword;

    @FindBy(id = "register-button")
    WebElement registerButton;

    @FindBy(linkText = "Gift Cards")
    WebElement giftCards;


    public void selectGender(String gender){
       myGender.click();
    }

    public void enterFirstName(String firstName){
        myFirstName.clear();
        myFirstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName){

        myLastName.clear();
        myLastName.sendKeys(lastName);
    }

    public void selectDateOfBirth(String dateOfBirth){

        Select select1 = new Select(birthDay);
        select1.selectByVisibleText("24");
        Select select2 = new Select(birthMonth);
        select2.selectByVisibleText("May");
        Select select3 = new Select(birthYear);
        select3.selectByVisibleText("1999");

    }

    public void enterEmail(String email){
        emailID.clear();
//        emailID.sendKeys(email);
        int myRandomNum = driverManager.generateRandomNumber();
        emailID.sendKeys(myRandomNum+email);
    }

    public void enterPassword(String password){
        myPassword.clear();
        myPassword.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword){

        myConfirmPassword.clear();
        myConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickOnRegister(){
        registerButton.submit();
    }


    public void clickOnGiftCards(){
        giftCards.click();
    }

}

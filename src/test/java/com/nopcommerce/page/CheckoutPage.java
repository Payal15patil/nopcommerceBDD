package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import com.sun.org.apache.bcel.internal.generic.L2D;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends DriverManager {

    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;

    @FindBy(id = "BillingNewAddress_City")
    WebElement city;

    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postcode;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;

    @FindBy(name = "save")
    WebElement continueButton;

    @FindBy(id = "shippingoption_1")
    WebElement shippingOption;

    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
    WebElement shippingContinueButton;

    @FindBy(name = "paymentmethod")
    WebElement checkOption;

    @FindBy(id = "paymentmethod_1")
    WebElement creditCardOption;

    @FindBy(id = "payment-method-buttons-container")
    WebElement paymentContinueButton;

    @FindBy(id = "CreditCardType")
    WebElement cardType;

    @FindBy(id = "CardholderName")
    WebElement cardHolderName;

    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    @FindBy(id = "ExpireMonth")
    WebElement cardExpireMonth;

    @FindBy(id = "ExpireYear")
    WebElement cardExpireYear;

    @FindBy(id = "CardCode")
    WebElement cardCode;

    @FindBy(id = "payment-info-buttons-container")
    WebElement paymentInfoContinue;

    @FindBy(id = "confirm-order-buttons-container")
    WebElement confirmButton;

    public void enterCountryName(String countryName){
        country.sendKeys(countryName);
    }

    public void enterCityName(String cityName){
        city.sendKeys(cityName);
    }

    public void enterAddress(String myAddress){
        address.sendKeys(myAddress);
    }

    public void enterPostcode(String myPostcode){
        postcode.sendKeys(myPostcode);
    }

    public void enterPhoneNumber(String myNumber){
        phoneNumber.sendKeys(myNumber);
    }

    public void  clickOnContinueButton(){
        continueButton.click();
    }

    public void selectShippingOption(){
       shippingOption.click();
    }

    public void clickOnShippingContinueButton(){
        shippingContinueButton.click();
    }

    public void selectCheckOption(){
        checkOption.click();
    }

    public void selectCreditCardOption(){
        creditCardOption.click();
    }

    public void clickOnPaymentContinueButton(){
        paymentContinueButton.click();
    }

    public void selectCreditCardType(String myCardType){
        Select select5 = new Select(cardType);
        select5.selectByIndex(1);
    }
    public void enterCardHolderName(String myName1)
    {
        cardHolderName.sendKeys(myName1);
    }
    public void enterCardNumber(String myCardNum) {
        cardNumber.sendKeys(myCardNum);
    }

    public void enterCardExpiryDate(String cardExpiryDate){
        Select select6 = new Select(cardExpireMonth);
        select6.selectByVisibleText("11");
        Select select7 = new Select(cardExpireYear);
        select7.selectByVisibleText("2024");
    }

    public void enterCardCode(String myCardCode){
        cardCode.sendKeys(myCardCode);
    }

    public void clickOnPaymentInfoContinueButton(){
        paymentInfoContinue.click();
    }

    public void clickOnConfirmButton(){
        confirmButton.click();
    }
}

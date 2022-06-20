package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends DriverManager {

    @FindBy(id = "FullName")
    WebElement nameForContactUs;

    @FindBy(name = "Email")
    WebElement emailForContactUs;

    @FindBy(id = "Enquiry")
    WebElement enquiryText;

    @FindBy(name = "send-email")
    WebElement submitButton;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]")
    WebElement resultText;

    public void enterNameForContactUs(String name){
        nameForContactUs.sendKeys(name);
    }
    public void enterEmailForContactUs(String emailAddress){
        emailForContactUs.sendKeys(emailAddress);
    }
    public void enterEnquiryForContactUs(String enquiry){
        enquiryText.sendKeys(enquiry);
    }

    public void clickOnSubmitButton(){
        submitButton.click();
    }

    public String getResultTextOnContactUsPage(){
        return resultText.getText();
    }
}

package com.nopcommerce.driver;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofSeconds;

public class DriverManager {
    public static WebDriver driver;
    String url = "https://demo.nopcommerce.com/";

    public DriverManager(){
        PageFactory.initElements(driver,this);
    }

    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public void gotoUrl(){
        driver.get(url);
    }
    public void applyImplicitWait(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public WebElement waitUntilElementIsClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,30);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitUntilElementIsVisible(WebElement element,int timeOut,String failureMessage){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.withMessage(failureMessage);
    }
    public int generateRandomNumber(){
        Random random = new Random();
        // Obtain a number between [0 - 200].
        return random.nextInt(200);
    }
    public void takeScreenshot(Scenario scenario){

        byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenShot, "image/png");
        //take a screen shot
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(scrFile, new File("/Users/patil/OneDrive/Desktop/screenShotTest/error.jpg"));
        } catch (IOException e) {
        // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void scrollTo(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void takeElementScreenshot(WebElement element, String fileName)  {
        File scnFile =element.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scnFile, new File("./target/screenshots/" +fileName+ ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void maxWindow(){
        driver.manage().window().maximize();
    }
    public void sleepWindow(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }

    public void closeWindow(){
        driver.quit();
    }


}

package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    //This method is used to find or create a logger with the name passed as parameter

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //This method is used to initialise the web element
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    //@CacheLookup  improves test execution performance and also faster

    /*@FindBy annotation is used readable, and maintainable. It also helps in reducing
     the chances of errors due to incorrect element locators.*/

    /*The WebElement interface provides methods to perform various actions on the elements,
    such as clicking, sending text, retrieving text, checking if an element is displayed or enabled, and many more. These methods allow you to simulate user
     interactions with the web page elements as part of your automated tests.
     */

    // I have used id locator to find username
    @CacheLookup
    @FindBy(id ="user-name")
    WebElement userName;

    // I have used id locator to find password
    @CacheLookup
    @FindBy(id = "password")
    WebElement password;
    // I have used id locator to find login button
    @CacheLookup
    @FindBy(id = "login-button")
    WebElement clickOnLogin;

    // I have used xpath locator to find product text
    @CacheLookup
    @FindBy(xpath ="//span[@class = 'title']")
    WebElement productText;

    //I have used xpath locator to find error text
       @CacheLookup
    @FindBy(xpath = "//h3[contains(text(),'Epic sadface: Username and password do not match a')]")
    WebElement errorText;

       // This method will send text to username field by using sendkey
    public void sendTextToUserNameField() {
        sendTextToElement(userName, "standard_user");
        log.info("Enter userName field :"+ userName + userName.toString());
    }
      // This method will send text to password field by using sendkey
    public void sendTextToPasswordField() {
        sendTextToElement(password, "secret_sauce");
        log.info("Enter userName field :"+ password + password.toString());

    }
     // This method will click on login button
    public void clickOnLoginButton() {
        clickOnElement(clickOnLogin);
        log.info("click on Login button" + clickOnLogin.toString());
    }
     // This method is used to verify the text
    public String getProductText(){
        log.info("verify product text" + productText.toString());
        return getTextFromElement(productText);
    }
     // This method is used to enter username by using sendText
    public void enterInvalidEmail(){
        sendTextToElement(userName, "xyz_user");
        log.info("Enter userName field :"+ userName + userName.toString());
    }

     // This Method is used to enter password by using sendText from utility class
    public void enterInvalidPassword(){
        sendTextToElement(password, "xyz_sauce");
        log.info("Enter userName field :"+ password + password.toString());
    }
     // This method is used to verify the error message
    public String getErrorMessage(){
        log.info("verify Error Message" + errorText.toString());
        return getTextFromElement(errorText);
    }
}

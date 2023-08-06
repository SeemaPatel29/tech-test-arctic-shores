package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage extends Utility {
    //This method is used to find or create a logger with the name passed as parameter
    private static final Logger log = LogManager.getLogger(PurchasePage.class.getName());

    public PurchasePage() {
        PageFactory.initElements(driver, this);
    }

    // I have used xpath to find the locator
    @CacheLookup
    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    WebElement sauceLabsBackpack;

    // I have used xpath to find locator for add your shopping to cart
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCart;
    // I have used xpath to find locator for shopping cart
    @CacheLookup
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    WebElement shoppingCart;
    // I have used xpath to find locator for checkout
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkout;
    // I have used xpath to find locator for firstname
 @CacheLookup
 @FindBy(xpath = "//input[@id='first-name']")
 WebElement firstName;

    // I have used xpath to find locator for lastname
    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;

    // I have used xpath to find locator for zipcode/postal code
    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipCode;

    // I have used xpath to find locator for continue button
    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;

    // I have used xpath to find locator for finish button
    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;

    // I have used xpath to find locator for thank you text
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Thank you for your order!']")
    WebElement thankYou;

    // I have used clickOnElement method from utility class and created clickOnSauceLabBackPack
    // Method so I can used this in steps file
    public void clickOnSauceLabBackPack(){
        clickOnElement(sauceLabsBackpack);
        log.info("click Sauce labs backpack" + sauceLabsBackpack.toString());
    }
    // I have used clickOnElement method from utility class and created clickOnAddToCart
    // Method so I can used this in steps file
     public void clickOnAddToCart(){
        clickOnElement(addToCart);
        log.info("click on Add to cart" + addToCart.toString());
}
    // I have used clickOnElement method from utility class and created clickOnSauceLadBackPack
    // Method so I can used this in steps file
public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
        log.info("click on shopping cart" + shoppingCart.toString());


}
    // I have used clickOnElement method from utility class and created clickOnCheckout
    // Method so I can used this in steps file
public void clickOnCheckout(){
        clickOnElement(checkout);
        log.info("click on checkout" + checkout.toString());
}
    // I have enter firstname by using sendText method from utility class and created the method to
    // used this method in steps file
public void enterFirstName(){
        sendTextToElement(firstName, "Sarah");
        log.info("Enter First name " + firstName.toString());

// I have enter lastname by using sendText method from utility class and created the method to
    // used this method in steps file
}
    public void enterLastName() {
        sendTextToElement(lastName, "Jonhs");
        log.info("Enter Last name " + lastName.toString());
    }
    // I have enter zipcode/postalcode by using sendText method from utility class and created the method to
    // used this method in steps file
    public void zipCode(){
        sendTextToElement(zipCode,"HA5 9SU");
        log.info("Enter Zip Code" + zipCode.toString());
    }
//I have used clickOnElement method from utility class and created clickOnContinue
    // Method so I can used this in steps file
    public void clickOnContinue(){
        clickOnElement(continueButton);
        log.info("Click On Continue Button" + continueButton.toString());

    }
    //I have used clickOnElement method from utility class and created clickOnFinishButton
    // Method so I can used this in steps file
    public void clickOnFinishButton(){
       clickOnElement(finishButton);
        log.info("Click On Finish Button" + finishButton.toString());

    }
    // I have made this return method to verify the text
    public String verifyThankYouText(){
        log.info("Verify Thank You Text" + thankYou.toString());
        return getTextFromElement(thankYou);

    }
    }

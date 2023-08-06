package com.saucedemo.steps;

import com.saucedemo.pages.PurchasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ProductSteps {
    @And("^I am on product page$")
    public void iAmOnProductPage() {
    }

    @And("^I click on sauce labs backpack$")
    public void iClickOnSauceLabsBackpack() {
        new PurchasePage().clickOnSauceLabBackPack();
    }

    @Then("^I add to cart$")
    public void iAddToCart() {
        new PurchasePage().clickOnAddToCart();
    }

    @And("^I click on shopping cart$")
    public void iClickOnShoppingCart() {
        new PurchasePage().clickOnShoppingCart();
    }

    @Then("^I click on checkout$")
    public void iClickOnCheckout() {
        new PurchasePage().clickOnCheckout();
    }

    @And("^I enter Frist Name$")
    public void iEnterFristName() {
        new PurchasePage().enterFirstName();
    }

    @And("^I enter Last name$")
    public void iEnterLastName() {
        new PurchasePage().enterLastName();
    }

    @And("^I enter Zip code$")
    public void iEnterZipCode() {
        new PurchasePage().zipCode();
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new PurchasePage().clickOnContinue();
    }

    @Then("^I click on finish button$")
    public void iClickOnFinishButton() {
        new PurchasePage().clickOnFinishButton();

    }

    @And("^I verify Thank you for your order message$")
    public void iVerifyThankYouForYourOrderMessage() {
        Assert.assertEquals(new PurchasePage().verifyThankYouText(),"Thank you for your order!");
    }
}

package com.saucedemo.steps;

import com.saucedemo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I enter username$")
    public void iEnterUsername() {
        new LoginPage().sendTextToUserNameField();
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new LoginPage().sendTextToPasswordField();
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();

    }

    @Then("^I verify the products text$")
    public void iVerifyTheProductsText() {
        Assert.assertEquals(new LoginPage().getProductText(),"Products");

    }

    @When("^I enter Invalid username$")
    public void iEnterInvalidUsername() {
        new LoginPage().enterInvalidEmail();
    }

    @And("^I enter Invalid password$")
    public void iEnterInvalidPassword() {
        new LoginPage().enterInvalidPassword();
    }

    @Then("^user is not able to login$")
    public void userIsNotAbleToLogin() {

    }

    @Then("^I verify the error message displayed on the screen$")
    public void iVerifyTheErrorMessageDisplayedOnTheScreen() {
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualMessage = new LoginPage().getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Error Message is displayed");
    }
}

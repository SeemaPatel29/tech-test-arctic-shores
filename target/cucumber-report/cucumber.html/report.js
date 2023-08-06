$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EndToEnd.feature");
formatter.feature({
  "line": 1,
  "name": "complete purchase end to end journey",
  "description": "",
  "id": "complete-purchase-end-to-end-journey",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5766316900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user should able to able to purchase",
  "description": "",
  "id": "complete-purchase-end-to-end-journey;user-should-able-to-able-to-purchase",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I am on product page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on sauce labs backpack",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I enter Frist Name",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter Last name",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter Zip code",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on finish button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I verify Thank you for your order message",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 205577300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterUsername()"
});
formatter.result({
  "duration": 243717700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterPassword()"
});
formatter.result({
  "duration": 126946700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 167631600,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iAmOnProductPage()"
});
formatter.result({
  "duration": 103400,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iClickOnSauceLabsBackpack()"
});
formatter.result({
  "duration": 110753000,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iAddToCart()"
});
formatter.result({
  "duration": 98015900,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iClickOnShoppingCart()"
});
formatter.result({
  "duration": 104435500,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iClickOnCheckout()"
});
formatter.result({
  "duration": 97911600,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iEnterFristName()"
});
formatter.result({
  "duration": 129423100,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iEnterLastName()"
});
formatter.result({
  "duration": 125187500,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iEnterZipCode()"
});
formatter.result({
  "duration": 128710800,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 102578700,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iClickOnFinishButton()"
});
formatter.result({
  "duration": 93566100,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iVerifyThankYouForYourOrderMessage()"
});
formatter.result({
  "duration": 50422400,
  "status": "passed"
});
formatter.after({
  "duration": 834004600,
  "status": "passed"
});
formatter.uri("LoginTest.feature");
formatter.feature({
  "line": 2,
  "name": "Login Test",
  "description": "As user I want to login into saucedemo website",
  "id": "login-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "duration": 2345264200,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should login successfully with valid credentials",
  "description": "",
  "id": "login-test;user-should-login-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify the products text",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 36600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterUsername()"
});
formatter.result({
  "duration": 237847800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterPassword()"
});
formatter.result({
  "duration": 137770100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 154278900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iVerifyTheProductsText()"
});
formatter.result({
  "duration": 56458500,
  "status": "passed"
});
formatter.after({
  "duration": 724744500,
  "status": "passed"
});
formatter.before({
  "duration": 2447112800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User should not login with Invalid credentials",
  "description": "",
  "id": "login-test;user-should-not-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I enter Invalid username",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I enter Invalid password",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user is not able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 67000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterInvalidUsername()"
});
formatter.result({
  "duration": 181077400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterInvalidPassword()"
});
formatter.result({
  "duration": 133699000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 116874400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userIsNotAbleToLogin()"
});
formatter.result({
  "duration": 82300,
  "status": "passed"
});
formatter.after({
  "duration": 808803800,
  "status": "passed"
});
formatter.before({
  "duration": 2358151400,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User should verify the error message diplayed for invalid login attemps",
  "description": "",
  "id": "login-test;user-should-verify-the-error-message-diplayed-for-invalid-login-attemps",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I enter Invalid username",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I enter Invalid password",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify the error message displayed on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 67300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterInvalidUsername()"
});
formatter.result({
  "duration": 186804700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterInvalidPassword()"
});
formatter.result({
  "duration": 142360800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 109266400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iVerifyTheErrorMessageDisplayedOnTheScreen()"
});
formatter.result({
  "duration": 46140600,
  "status": "passed"
});
formatter.after({
  "duration": 722948400,
  "status": "passed"
});
});
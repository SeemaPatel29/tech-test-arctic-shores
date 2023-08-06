@smoke
Feature: Login Test
  As user I want to login into saucedemo website


  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When I enter username
    And I enter password
    And  I click on login button
    Then I verify the products text

   Scenario: User should not login with Invalid credentials
     Given  I am on homepage
     When I enter Invalid username
     And  I enter Invalid password
     And I click on login button
     Then  user is not able to login

     Scenario: User should verify the error message diplayed for invalid login attemps
       Given I am on homepage
       When I enter Invalid username
       And  I enter Invalid password
       And  I click on login button
       Then I verify the error message displayed on the screen


Feature: complete purchase end to end journey
@smoke
  Scenario: user should able to able to purchase
    Given I am on homepage
    When I enter username
    And I enter password
    And  I click on login button
    And I am on product page
    And I click on sauce labs backpack
    Then I add to cart
    And I click on shopping cart
    Then I click on checkout
    And I enter Frist Name
    And I enter Last name
    And I enter Zip code
    And I click on continue button
    Then I click on finish button
    And I verify Thank you for your order message


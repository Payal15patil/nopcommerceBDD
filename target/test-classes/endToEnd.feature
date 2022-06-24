@EndToEnd
Feature: End to End Functionality
  As a user
  I want to register
  So I can buy products


  Scenario: Buy One Product with Money order
    Given I am on the home page
    And I click on the register
    And I enter following details to register
      | gender | firstName | lastName | email               | password | confirmPassword |
      | female | pinkal     | patel    | patelpinky15@gmail.com | 206@494  | 206@494         |
    And I click on Register Button
    And I click on "jewelry"
    And I click on ADD TO CART button for Flower Girl Bracelet
    And I click on shopping cart
    And I select "Yes" for Gift Wrapping
    And I select terms and conditions
    And I click on checkout button
    And I enter following details on checkout page in Billing Address
      | country        | city   | address1          | postcode | phoneNumber |
      | United Kingdom | London | 10 Hickiling Road | IG12HY   | 7424102233  |
    And I click on continue button
    Then I select Next Day Air option in shipping method
    And I click on continue button of shipping method
    Then I select Check/Money order option in payment method
    And I click on continue button of payment method
    Then I click on continue button of payment information
    And I click on confirm button on checkout page
    And I should see "Your order has been successfully processed!" text on "checkout/completed" page
    And I should see order number
#    And I click on "click here for order details" link
#    And I click on print button on order details page




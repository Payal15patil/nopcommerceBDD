Feature: End to End Functionality
  As a user
  I want to register
  So I can buy products

  @EndToEnd1
  Scenario: Buy One Product with Card payment
    Given I am on the home page
    And I click on the register
    And I enter following details to register
      | gender | firstName | lastName | email                | password | confirmPassword |
      | male   | Jay       | Patil    | jaypatil20@gmail.com | 2020@106 | 2020@106        |
    And I click on Register Button
    And I click on "electronics"
    When I click on cell phones from electronics page
    And I click on ADD TO CART button for Nokia Lumia 1020
    And I click on shopping cart
    And I select terms and conditions
    And I click on checkout button
    And I enter following details on checkout page in Billing Address
      | country        | city   | address1       | postcode | phoneNumber |
      | United Kingdom | London | 94 Boleyn Road | E79QG    | 7449727580  |
    And I click on continue button
    And I click on continue button of shipping method
    Then I select Credit Card option in payment method
    And I click on continue button of payment method
    And I enter following details on checkout page in Payment Information
      | cardType    | cardholderName | cardNumber       | expiryDate | cardCode |
      | Master card | Jay Patil      | 4444333322221111 | 11/2024    | 345      |
    Then I click on continue button of payment information
    And I click on confirm button on checkout page
    And I should see "Your order has been successfully processed!" text on "checkout/completed" page
    And I should see order number
    And I click on "click here for order details" link
    And I click on print button on order details page
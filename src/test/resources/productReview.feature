@review @regression
Feature: Review product
  As a customer
  I want to add review for product

  Scenario: Validate product review
    Given I am on the home page
    And I click on the register
    And I enter following details to register
      | gender | firstName | lastName | date of birth | email                | password | confirmPassword |
      | female  | mayuri   | patel    | 24/4/2007      | mayupatel@gmail.com | 546546  | 546546          |
    And I click on Register Button
    And I click on "giftcards"
    And I click on "$25 Virtual Gift Card" product on gift cards page
    And I click on Add your review on $25-virtual-gift-card page
    And I enter following details on product review page
      | title     | text                                  |
      | gift card | This Product is useful to gift anyone |
    And I select excellent radio button for rating
    When I click on submit review button
    Then I should see "Product review is successfully added." text on "productreview" page
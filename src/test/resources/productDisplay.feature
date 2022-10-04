@display @regression
Feature: product display
  As a customer
  I want select display for products
  So I can check products

  Scenario: Validate position for products
    Given I am on the home page
    And I click on "digitaldownloads"
    When I select "9" per page in display box
    Then I should see 9 products on page
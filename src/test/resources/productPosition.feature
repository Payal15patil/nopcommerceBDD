@Display
Feature: product position
  As a customer
  I want select position for products
  So I can check products

  Scenario: Validate position for products
    Given I am on the home page
    And I hover on sub categories of apparel
    And I click on Accessories
    When I select "Name: A TO Z" position in sort by box
    Then I should see all product in A to Z position
@vote
Feature: Vote feature
  As a customer
  I want to vote for website

  Scenario: Validate vote for website without registration
    Given I am on the home page
    And I scroll down to community poll
    And I select good option for do you like nopcommerce?
    When I select vote button on home page
#    Then I should see "Only registered users can vote" text on "home" page
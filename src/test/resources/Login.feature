@Login
Feature: login feature
  As a user
  I want to Login
  So I can buy products

  Scenario: Validate Login page
    Given I am on the home page
    When I click on the Log in
    Then I should see "Welcome, Please Sign In!" text on login page
    And the url should contain with "/login"

    Scenario: Successful Login with valid credentials
      Given I am on the home page
      When I click on the Log in
      And I enter emailId and password
      And I click on login button
      Then I should see Log out on header

@Registration
Feature: Register Feature
  As a user
  I want to register
  So I can login to website

  Scenario: Enter Registration Details
    Given I am on the home page
    And I click on the register
    And I select gender
    And I enter First Name
    And I enter Last Name
    And I enter email
    And I enter Password
    And I enter Confirm Password
    When I click on Register Button
    Then I should see "Your Registration Completed" message
    And I should see My account on header
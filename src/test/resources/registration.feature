
Feature: Register Feature
  As a user
  I want to register
  So I can login to website

  Scenario: Successful Registration
    Given I am on the home page
    And I click on the register
    And I select "gender"
    And I enter "first name"
    And I enter "last name"
    And I select Date of Birth
    And I enter "email"
    And I enter "Password"
    And I enter "Confirm Password"
    When I click on Register Button
    Then I should see "Your Registration Completed" text on "registration" page
    And I should see My account on header
    And I should see Log out on header
    And the url should contain with "/registerresult"

  @Registration
  Scenario: Registration with Data Table
    Given I am on the home page
    And I click on the register
    And I enter following details to register
      | gender | firstName | lastName | date of birth | email                | password | confirmPassword |
      | male   | yogesh    | patil    | 2/2/1989      | yogpatil22@gmail.com | 898922   | 898922          |
      | female | pinkal    | patel    | 25/5/1999     | pinkpatel@gmail.com  | 999925   | 999925          |
      | male   | vatsal    | patel    | 16/4/2002     | patelvats@gmail.com  | 216245   | 216245          |
    When I click on Register Button
    Then I should see "Your Registration Completed" text on "registration" page
    And I should see My account on header
    And I should see Log out on header
    And the url should contain with "/registerresult"

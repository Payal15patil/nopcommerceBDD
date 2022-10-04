
Feature: login feature
  As a user
  I want to Login
  So I can access website

  Scenario: Validate Login page
    Given I am on the home page
    When I click on the Log in
    Then I should see "Welcome, Please Sign In!" text on "login" page
    And the url should contain with "/login"

  @Login1
  Scenario: Successful Login with valid credentials
    Given I am on the home page
    And I click on the register
    And I enter following details to register
      | gender | firstName | lastName | date of birth | email                 | password | confirmPassword |
      | male   | sneha     | patil    | 26/7/1999     | snehpatil54@gmail.com | 556456   | 556456          |
    And I click on Register Button
    And I click on continue button on register/result page
    And I click on logout on register/result page
    When I click on the Log in
    And I enter emailId "snehpatil54@gmail.com" and password "556456"
    And I click on login button
    Then I should see Log out on header


  Scenario Outline: Login with more than one Emails and Passwords
    Given I am on the home page
    And I click on the register
    And I enter following details to register
      | gender | firstName | lastName | date of birth | email                   | password | confirmPassword |
      | male   | sneha     | patil    | 26/7/1999     | snehpatil123@gmail.com  | 456456   | 456456          |
      | female | pink      | patel    | 25/5/1999     | pinkalpatel12@gmail.com | 255255   | 255255          |
      | male   | vats      | patel    | 16/4/2002     | vpatel21@gmail.com      | 164164   | 164164          |
    And I click on Register Button
    And I click on continue button on register/result page
    And I click on logout on register/result page
    When I click on the Log in
    And I enter emailId "<Email>" and password "<Password>"
    And I click on login button
    Then I should see Log out on header

    Examples:
      | Email                   | Password |
      | snehpatil123@gmail.com  | 456456   |
      | pinkalpatel12@gmail.com | 255255   |
      | vpatel21@gmail.com      | 164164   |




@contact
Feature: Contact Us Feature
  As a customer
  I want to contact the store owner
  So I can send my enquiry

  Scenario: Successful enquiry using Contact Us
    Given I am on the home page
    And I scroll down to footer
    When I click on Contact Us
    And I enter following details on Contact Us page
      | name  | email                | enquiry                      |
      | Payal | payal15794@gmail.com | I want to change the product |
    Then I click on submit button
    And I should see "Your enquiry has been successfully sent to the store owner." text on "contactus" page

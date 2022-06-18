@EndToEnd
Feature: Search box feature
  As a customer
  I want to search products
  So I can see available products

  Scenario: Validate search box to search products
    Given I am on the home page
    And I enter "Electronics" in search box
    And I click on search
    And I click on advanced search check box
    And I select "Electronics >> Cell phones" option in category field
    And I click on automatically search sub categories  check box
    And I select "All" option in manufacturer field
    And I click on search in product descriptions check box
    When I click on search button
    Then I should see all products

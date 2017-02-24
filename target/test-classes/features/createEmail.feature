Feature: As a user I want to be able to successful sent Emails


Scenario: Successful sent Email
    Given I navigate to Main Page
    When I login with correct credentials
    And I navigate to Create Email page
    Then I should be able to create Email
    When I create Email
    Then I should navigate to Success Send Mail Page
    
Scenario: Check is Email present on Sent Email Page(positive TC)
    Given I navigate to Main Page
    When I login with correct credentials
    And I navigate to Create Email page
    And I create Email
    When I navigate to Sent Email Page
    Then I should be see my sent Email with correct body
    
Scenario: Check is Email present on Sent Email Page_negative TC
    Given I navigate to Main Page
    When I login with correct credentials
    And I navigate to Create Email page
    And I create Email
    When I navigate to Sent Email Page
    Then I should be see my sent Email with incorrect body
    
 Scenario: Check email contains_positive TC
    Given I navigate to Main Page
    When I login with correct credentials
    And I navigate to Create Email page
    And I create Email
    When I navigate to Sent Email Page
    And Open sent Email
    Then I should see correct email contains 
    
 Scenario: Check email contains_negative TC
    Given I navigate to Main Page
    When I login with correct credentials
    And I navigate to Create Email page
    And I create Email
    When I navigate to Sent Email Page
    And Open sent Email
    Then I should see incorrect email contains
Feature: As a user I want to be able to successful login in to i.ua web site

  Scenario: Successful login (positive TC)
    Given I navigate to Main Page
    Then I should be able to login
    When I login with correct credentials
    Then I should be redirected to MailBox Page
 #
  #Scenario: Unsuccessful login (negative TC)
    #Given I navigate to Main Page
    #Then I should be able to login
    #When I login with incorrect credentials
    #Then I should be redirected to MailBox Page

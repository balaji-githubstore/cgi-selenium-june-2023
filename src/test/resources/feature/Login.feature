@login
Feature: Login
  In order to maintain employee records 
  As an admin 
  I want to access the dashboard

  Background: 
    Given I have browser with OrangeHRM Application
    

  @valid @smoke
  Scenario: Valid Login
    When I enter username as 'Admin'
    And I enter password as 'admin123'
    And I click on login
    Then I should access to the dashboard with header as 'Dashboard'

  @invalid
  Scenario Outline: Invalid Login
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    Then I should not get access to portal with error '<expected_error>'

    Examples: 
      | username | password | expected_error      |
      | john     | john123  | Invalid credentials |
      | peter    | peter123 | Invalid credentials |

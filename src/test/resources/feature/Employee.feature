@employee
Feature: Employee
  In order to maintain employee records 
  As an admin 
  I want to add,edit,delete employee details

  Scenario: Add Valid Employee
    Given I have browser with OrangeHRM Application
    When I enter username as 'Admin'
    And I enter password as 'admin123'
    And I click on login
    And I click on PIM menu
    And I click on Add Employee
    And I fill the new employee details
      | firstname | middlename | lastname | username | password |
      | john      | k          | wick     | john_01  | john123  |
    And I click on save
    Then I should get the message as "Added Successfully"

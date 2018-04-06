Feature: PIM

  In order to test the PIM
  As a Admin user
  I want to verify that an employee is created successfully

  Scenario: Verify that is possible to create an employee
    Given I login as Admin user on orangehrm index page
    When I click on PIM tab
      And I click on Add Employee tab
      And I fill the employee from with the following data:
        | FirstName  | Yuri   |
        | MiddleName | Vayne  |
        | Last Name  | Rivera |
      And I click on Save Button
      And I click on Employee List tab
      And I fill the full employee name on Employee Name text field
      And I click on Search Button
    Then the employee created should be displayed on employee table




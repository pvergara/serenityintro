Feature: Using sauce demo

  @regression
  @AutomationExercise
  @automation-1
  Scenario: Create a new user
    Given I access to the main page
    And Click on sign-up button
    When I fill the name and email and click on submit
    Then I'm on the SignUp page

  @regression
  @AutomationExercise
  @automation-2
  @DeleteUserWhenItHasBeenCreated
  Scenario: Create a new user
    Given I access to the main page
    And Click on sign-up button
    And I fill the name and email and click on submit
    And I'm on the SignUp page
    When I fill expected data to create a user
    Then I create a user
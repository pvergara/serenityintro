Feature: Using sauce demo

  @regression
  @AutomationExercise
  Scenario: Create a new user
    Given I access to the main page
    And Click on sign-up button
    When I fill the name and email and click on submit
    Then I'm on the SignUp page
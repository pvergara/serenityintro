Feature: Using sauce demo

  Scenario: Login as standard user
    Given I access to the sauce demo user
    When I login with standard user
    Then I can verify I'm on the product list

  Scenario: Login as performance glitch user
    Given I access to the sauce demo user
    When I login with 'performance glitch' user
    Then I can verify I'm on the product list

  Scenario: Accessing to the product detail
    Given I access to the sauce demo user
    And I login with 'standard' user
    When I select a given product
    Then I'll be on the product detail page
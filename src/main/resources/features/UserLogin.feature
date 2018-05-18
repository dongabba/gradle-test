Feature: User login

  Scenario: user login as administrator
    Given User open login page
    When User type login and password
    And User click Login button
    Then User should see admin main page

  Scenario: user login as doctor
    Given User open login page
    When User type login and password
    And User click Login button
    Then User should see doctor main page

  Scenario: user login as patient
    Given User open login page
    When User type login and password
    And User click Login button
    Then User should see patient main page
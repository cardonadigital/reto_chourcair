@LOGIN
Feature:Login

  Background: the user open the browser
    Given  the user TestingUser opens the browser

  @LOGIN-HP*
  Scenario: User successfully login in the site
    When enter the userName: "admin" and the password: "serenity"
    And click button Sign Up
    Then the Dashboard page will be displayed

  @LOGIN-FE
  Scenario: User failed to login in the site with wrong credentials
    When enter the userName: "admin"
    And enter the password: "wrongPassword"
    And click button Sign Up
    Then the site will display the following alert: "Invalid username or password"
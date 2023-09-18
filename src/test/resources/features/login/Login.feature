Feature: Login into Female Daily app

  Background: user launch female daily app
    Given user at home screen app

  @login
  Scenario: login with valid username and password
    Given user at login form screen
    When user input valid username and password
    Then user can login into member area
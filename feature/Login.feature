@LoginFeature
Feature: Login
  This feature will test login related scenarios

  Background: example of background scenario
    Given the browser opens
    When I enter URL's test web
    Then Page shows and credentials are asked

  @Happy
  Scenario: Happy path when everything works ok
    Given Im at login page
    When Valid credentials are entered
    Then The welcome page shows successfully

Feature: Test automation

  @TC1
  Scenario Outline: Test framework auto
    Given I go to the facebook website
    When I fill the email "<email>" and passWord "<passWord>"
    Then I click to login button
    Examples:
      | email                 | passWord   |
      | quang99ptit@gmail.com | quangml123 |
Feature: AmazonHomePage Testing

  @TC1
  Scenario Outline: Amazon verify title
    Given I go to the Amazon website
    When I search product "<nameProduct>" in search bar
    Then I verify the title of first product is name "<title>"
    Examples:
      | nameProduct | title                                                     |
      | iphone 14   | Apple iPhone 13 Pro Max, 512GB, Gold - Unlocked (Renewed)  |
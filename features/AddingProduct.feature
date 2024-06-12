Feature: Letshop e-commerce website

  @TestSanity
  Scenario: Login to appliaction and add product
    Given URL is loaded
    When user enters the email ID
    And user enter the password
    When user clicks on login button
    Then verfiy logged in successfully

  @TestEX2
  Scenario: Add product iphone from Letshop
    Given URL is loaded
    When user enters the email ID
    And user enter the password
    When user clicks on login button
    Then verfiy logged in successfully
    When click on the product iphone
    And click Add To Cart button

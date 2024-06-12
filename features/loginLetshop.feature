Feature: Letshop e-commerce website

  Background: 
    Given URL is loaded
    When user enters the email ID
    And user enter the password
    When user clicks on login button

  @TestEx1
  Scenario: Login to appliaction with username and password
    Then verfiy logged in successfully

  @TestEX2
  Scenario: Add product Zara from Letshop
    Then verfiy logged in successfully
    When click on the product zara
    And click Add To Cart button

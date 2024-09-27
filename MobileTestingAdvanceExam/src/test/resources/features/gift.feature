Feature: Validate gifting functionality of Plum Goodness App

  Background:
    Given user opens application
    Then  verify user is on home page
    When  user clicks on gifting option


  Scenario: verify user can choose gift functionality
    Then  verify gifting page is displayed


  Scenario: verify estimated delivery date for given pin code
    When user clicks on first product
    And  user search for "delivery.pincode"
    And  user clicks on "check.button"
    Then verify estimated delivery date is displayed





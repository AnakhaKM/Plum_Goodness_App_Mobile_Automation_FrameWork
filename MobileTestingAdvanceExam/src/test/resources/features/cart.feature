Feature: Validate cart functionality of Plum Goodness App

  Scenario: Verify user can add product into cart
    Given user opens application
    Then  verify user is on home page
    When  user search "product.search" in search bar
    Then  verify searched product  is displayed
    When  user clicks on add to cart button of first product
    Then  verify product added to cart successfully

    Scenario: Verify user can remove product from cart
      Given user opens application
      Then  verify user is on home page
      When  user search "product.search" in search bar
      Then  verify searched product  is displayed
      When  user clicks on add to cart button of first product
      Then  verify product added to cart successfully
      When user clicks on add to cart icon
      And  user clicks on delete icon
      And  user clicks on remove button
      Then verify product successfully removed from cart





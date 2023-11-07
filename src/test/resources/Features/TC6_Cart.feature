Feature: Cart Module API Automation

  Scenario Outline: Verify AddToCart to the application through api
    Given User add header and bearer for accessing endpoints
    When User add request body text to add product in the cart with "<productId>","<productVariationId>" and "<type>"
    And User send "POST" request for addToCart endpoint
    Then User should verify the status code is 200
    And User should verify the addToCart response message matches "Product added in cart"

    Examples: 
      | type |
      | plus |

  Scenario: Verify getCartItems to the application through api
    Given User add header and bearer for to getCartItems
    And User send "GET" request for getCartItems endpoint
    Then User should verify the status code is 200
    And User should verify the getCartItems response message matches "OK" and saved cartAddressId and cartId

  Scenario: verify setADdress to the application through api
    Given User add header and bearer for accessing endpoints
    When User add request body text to set address in the cart with "<cartAddressId>" and "<cartId>"
    And User should "POST" request for setADdress endpoint
    Then User should verify the status code is 200
    And User should verify the setADdress response message matches "Cart updated successfully"

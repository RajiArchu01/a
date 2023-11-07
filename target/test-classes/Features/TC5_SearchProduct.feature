Feature: Product Module API Automation

  Scenario Outline: Verify search product to the application through api
    Given User add header for to searchProduct
    When User add request body text for get productList of "<product>"
    And User send "POST" request for SearchProduct endpoint
    Then User should verify the status code is 200
    And User should verify the productList response message matches "OK" and saved categoryId and id and type

    Examples: 
      | product |
      | Nuts    |

  Scenario Outline: Verify product list to the application through api
    Given User add header for to productList
    When User add request body text to get product details with "<categoryId>" and "<pageNo>"
    And User send "POST" request for ProductList endpoint
    Then User should verify the status code is 200
    And User should verify the productList response message matches "OK" and saved productId and productVariationId

    Examples: 
      | pageNo |
      |      0 |

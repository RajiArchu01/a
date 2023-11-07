Feature: Order Module API Automation

  Scenario Outline: Verify createOrder to the application through api
    Given User add header and bearer for accessing endpoints
    When User add request body text to create order with "<paymentType>","<cardNo>","<cardType>","<year>","<month>" and "<cvv>"
    And User send "POST" request for createOrder endpoint
    Then User should verify the status code is 200
    And User should verify the createOrder response message matches "Order created successfully" and saved orderId

    Examples: 
      | paymentType | cardNo           | cardType | year | month | cvv |
      | debit_card  | 5555555555552222 | visa     | 2023 |    03 | 123 |
      
      Scenario: Verify getOrderDetails to the application through api
      Given User add header and bearer for accessing getOrderDeatils endpoint
      And User send "GET" request for getOrderDetails endpoint
      Then User should verify the status code is 200
      And User should verify the getOrderDetails response message matches "OK" and saved itemId
      
      Scenario: Verify TrackOrder to the application through api
      Given User add header and bearer for accessing TrackOrder endpoint
      And User send "GET" request for TrackOrder endpoint
      Then User should verify the status code is 200
      And User should verify the TrackOrder response message matches "Order has been received","Order is in Process" and "Order Delivered successfully"
      
      

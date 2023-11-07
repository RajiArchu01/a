Feature: Address Module API Automation

  Scenario: Verify get user address to the application through api
    Given User add header for accessing getAddress endpoints
    And User send "GET" request for getUserAddress endpoint
    Then User should verify the status code is 200
    And User should verify the getUserAddress response message matches "OK"

  Scenario Outline: Verify add user address to the application through api
    Given User add header and bearer authorization for accessing address endpoints
    When User add request body for add new address "<firstName>","<lastName>","<mobile>","<apartment>",<stateId> ,<cityId> ,<countryId> ,"<zipcode>","<address>" and "<addressType>"
    And User send "POST" request for addUserAddress endpoint
    Then User should verify the status code is 200
    And User should verify the addUserAddress response message matches "Address added successfully"

    Examples: 
      | firstName | lastName | mobile     | apartment | stateId | cityId | countryId | zipcode | address | addressType |
      | Stallon   | Chandru  | 7639988912 | prince    |     123 |     11 |       101 |  600081 | Chennai | Home        |

  Scenario Outline: Verify update user address to the application through api
    Given User add header and bearer authorization for accessing address endpoints
    When User add request body for update new address "addressId","<firstName>","<lastName>","<mobile>","<apartment>",<stateId> ,<cityId> ,<countryId> ,"<zipcode>","<address>" and "<addressType>"
    And User send "PUT" request for updateUserAddress endpoint
    Then User should verify the status code is 200
    And User should verify the updateUserAddress response message matches "Address updated successfully"

    Examples: 
      | firstName | lastName | mobile     | apartment | stateId | cityId | countryId | zipcode | address | addressType |
      | Stallon   | Chandru  | 7639988912 | prince    |     123 |     11 |       101 |  600081 | Chennai | Home        |

  Scenario: Verify delete user address to the application through api
    Given User add header and bearer authorization for accessing address endpoints
    When User add request body for delete new address "address_Id"
    And User send "Delete" request for deleteAddress endpoint
    Then User should verify the status code is 200
    And User should verify the deleteAddress response message matches "Address deleted successfully"

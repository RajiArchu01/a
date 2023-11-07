Feature: City Module API Automation

  Scenario: Verify User Get CityList through api
    Given User add header for to get CityList
    When User add request body state id for get city list
    And User send "POST" request for CityList endpoint
    Then User should verify the status code is 200
    And User verify the citylist response message matches "Avadi" and saved city id

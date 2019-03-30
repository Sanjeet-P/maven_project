Feature: Testing Login Feature

  Scenario: Test login with valid credentials
    Given Open the Chrome browser and start the application
    When I enter valid name	and valid password
    Then User should be able to login successfully

  
  
  @test1
  Scenario: Test 	login with invalid credentials
    Given Open the Chrome browser and start the application
    And I enter wrong name and wrong password
    Then User should be able to login successfully
  
Feature: Test_StakeHolder_Internal_External_Navigation
  I wish to test Filter functionality of StakeHolder Page

  Scenario: Test Internal External Filter Navigation 
    Given user on login page 
    
    When User types correct username and password 
    And user clicks on login button
    
    Then User clicks on Client Tab 
    And  User click on Internal and External Filter
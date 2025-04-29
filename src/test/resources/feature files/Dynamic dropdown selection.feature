@WorkBook1
Feature: Select arrival and destination city in MakeMyTrip

  As User
  I want to select 'From' and 'To' cities using dynamic dropdown
  So that i can search for flights successfully

  Scenario Outline: Selecting 'From' and 'To' cities and searching for flights
    Given User is on the MakeMyTrip homepage
    When User enters "<FromCityPartial>" into the From city field
    And User selects "<FromCity>" from dynamic From dropdown
    And User enters "<ToCityPartial>" into the To city field
    And User selects "<ToCity>" from dynamic To dropdown
    And User clicks on search button
    Then User should see selected cities "<FromCity>" and "<ToCity>" on the result page
    Examples:
      | FromCityPartial | FromCity | ToCityPartial | ToCity |
      | Man             |Mangalore, India|Bang          |Bengaluru|



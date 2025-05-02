@WorkBook2
Feature: Download and validate content in Records of medals at the Games of the Olympiad document

  As User
    I want to download Records of medals at the Games of the Olympiad
    So that i can search individuals with Highest medal counts


  Scenario:
    Given User is on IOC homepage and clicks on menu
    When User clicks on Documents menu
    And User navigates to olympics games menu
    And User navigates to factsheet menu
    And User views Records of medals at the Games of the Olympiad
    Then User download and validates records



Feature: Truck driver see all vehicle odometer information on the grid
  Background: Truck driver is on the VyTrack login page


  Scenario: Verify that truck driver should be able to see all vehicle odometer information on the grid
    When Truck driver is on the VyTrack login page and logs in
    Then User clicks on Fleet and Vehicle Odometer


    Then User in on Vehicle Odometer see "Odometer Value", "Date", "Driver", "Model" and "Unit" on the grid


















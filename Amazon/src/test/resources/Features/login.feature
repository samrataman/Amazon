#Author: Aman Kumar
@tag
Feature: User should allow to LOgin to the valid account

 Background: 
    Given Browsere is "Chrome"
    
  @validLogin
  Scenario: User can login using valid credentials
  	Given user navigates to amazon web page
    When user clicks on Signin button
    Then Amazon login page will open


#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Home Page Navigation 

 Scenario: Home Page navigation and verification.
    Given User is on "https://www.amcsgroup.com"
    When Default Language is English 
    And User click on "English"
    Then Language dropdown list should contain " Netherlands, Deutch, Espanol, Dansk, Francais, English (United Kingdom)"
    
    
Scenario: Verifying Language dropdown    
    Given  User is on "https://www.amcsgroup.com"
    When User click on English 
    Then Verify that in drop down are not options: Slovak, Irish, undefined

Scenario: Navigating to career page
    Given  User is on "https://www.amcsgroup.com"
    When User click on the option "Careers" on the bottom of the page
    Then Page Url should be "https://www.amcsgroup.com/careers/#"	
  
Scenario: Verifying countries listed in Careerpage
    Given  User is on "https://www.amcsgroup.com/careers/#"
    When User scroll down to Explore our careers section
    Then  Countries list should contain	"United States, United Kingdom, Australia and Ireland" 
    And   Countries list should not contain "Slovakia, Poland and Papua New Guinea"
    
Scenario: Verifying categories listed in Careerpage
    Given  User is on "https://www.amcsgroup.com/careers/#"
    When User scroll down to Explore our careers section
    Then  categories list should contain	"Professional Services and Sales Marketing "
    And   categories list should not contain "Fishing, Hunting and Driving"
    
Scenario: Verifying categories listed in Careerpage
    Given  User is on "https://www.amcsgroup.com/careers/#"
    When  User click on "Ireland" checkboxin countries list
    Then  User should land on "https://www.amcsgroup.com/careers/?countries=ireland"

    
    


    
    





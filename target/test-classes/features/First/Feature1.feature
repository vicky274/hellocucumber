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
@FirstFeature
Feature: Test case Execution in Amazon

  @smoketest
  Scenario: Scenario 1 Open url in Amazon First Feature
    When i open the url "https://www.amazon.in/"
    
     @smoketest
  Scenario: Scenario 2 Open url in Amazon First Feature
    When i open the url "https://www.amazon.in/"
    
    
 
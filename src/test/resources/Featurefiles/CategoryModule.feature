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
Feature: Category Module
  			Verify if admin is able to create category and delete it

  Scenario Outline: Create and Delete Category
    Given I navigate to skillrary app
    And login to skillrary as admin
    When I enter category page
    And add a <category>
    Then category should be created
    When I delete category
    Then category should be removed from category list
    And logout of skillrary

    Examples: 
      | category   |
      | RPA        |
      | Automation |

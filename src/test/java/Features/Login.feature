@all
Feature: Test DemoWebShop page I want to use this template for my feature file

  Scenario Outline: Testing of LogIn Page
    Given I am on DemoWebShop Homepage launching '<url>'
    When I click on login link
    Then I will be on Login Page and Capture the title of the page
    And I entered email id as '<emailId>' on the page
    And I entered password as '<password>' on the page
    And I click on Login button

    Examples: 
      | url                                | emailId        | password   |
      | https://demowebshop.tricentis.com/ | Itest@test.com | Itest@test |

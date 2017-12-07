@newsLetter
Feature: User Subscribe to NewsLetter in AutomationPractise site
  As a User
  I want to enter email in NewsLetter
  So that I can successfully subscribe to newsletter

  @news
  Scenario: User can subscribe to NewsLetter successfully
    Given User is on the home page
    When User enters email in Newsletter as "ar.abrhplabeas123@gmail.com"
    And User clicks on submit newsletter icon
    Then User should see message as "Newsletter : You have successfully subscribed to this newsletter."

  @smoke5
  Scenario Outline: User can not able to subscribe NewsLetter
    Given User is on the home page
    When User enters email in Newsletter as "<Email>"
    And User clicks on submit newsletter icon
    Then User should see message as "<NewsLetterMessage>"
    Examples:
      | Email                    | NewsLetterMessage                                                 |
      | anugu.archana@gmail.com  | Newsletter : This email address is already registered.            |
      | hkjla                    | Newsletter : Invalid email address.                               |
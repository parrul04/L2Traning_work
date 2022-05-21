Feature: QA website Login functionality


Scenario:  login with valid credentials
Given I am on login page
When I entered valid username "test04"
And i entered valid password "Testuser@04"
And I click on Login button
Then User should navigate to user Home Page
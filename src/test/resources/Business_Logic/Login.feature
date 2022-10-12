
Feature: Login funtionality

Background: User cancelled initial Login window
Given User proviod browser name as "Chrome" and exe 
Given User enter url as 
Given User cancel initial Login window

@SmokeTest
Scenario: Login functionality with valid credentials
When user navigate on Login tab
When user click on MyProfile
When user enter "8149524177" as username
When user enter "515151" as password
When user click on Login button
Then Application shows user profile to user

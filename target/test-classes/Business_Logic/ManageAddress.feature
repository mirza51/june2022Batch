Feature: Manage Addresses Funtionality


Background: User succesfully clicked on Initial Login window
Given User proviod browser name as "Chrome" and exe 
Given User enter url as 
Given User cancel initial Login window

When user navigate on Login tab
When user click on MyProfile 
When user enter "8149524177" as username
When user enter "515151" as password
When user click on Login button

@RegressionTest
Scenario: Manage Addresses with all data
When user click on manage Addresses
When user click on add address
When user send "mirza asad" as name
When user send "8149524177" as number
When user send "414001" as pinCode
When user send "nagar" as locality
When user send "mulla collony" as address
When user send "ahmednagar" as city
When user send "near inam masjid" as landmark
When user send "9822688347" as alternate phone number
When user click on radio buttone
When user click on save buttone
Then address added successfuly


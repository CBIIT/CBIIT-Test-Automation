Feature: Regression testing
@AlenaAppTracker
Scenario Outline: Verify that the user can enter their basic information when applying for a vacancy
Given User is on a login page of NIH website
When User will login to the application as "nekrashevicha2" user
And User is in Executive Careers page
And User chooses position as "Product Manager"
And User will click Sign In and Apply button
And User enters "<First Name>" into "First Name" input box
And User enters "<Middle Name>" into "Middle Name" input box
And User enters "<Last Name>" into "Last Name" input box
And User enters "<Email Address>" into "Email Address" input box
And User enters phone number as "<Phone Number>"
And User enters business phone number as "<Business Phone Number>"
And User chooses "<Doctoral degree>" on doctoral degree
And User clicks on Next button
Then User is on Address page

Examples:
|First Name|Middle Name|Last Name|Email Address|Phone Number|Business Phone Number|Doctoral degree|
|John      |Michael    |Brown    |aa@a.com     |2021234433  |2021113322           |yes            |


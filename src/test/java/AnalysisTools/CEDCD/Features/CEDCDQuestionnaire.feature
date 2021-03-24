Feature: Questionnaire

#@Progression
Scenario Outline: Admin able to add cohort
Given the user is on the CEDCD homepage
When the user is logged in as Admin
#When user selects add new Cohort
#And enters Cohort Name as "<Cohort Name>"
#And enters Cohort Acronym as "<Cohort Acronym>"
#And enters Cohort Owner
#And enters "<Notes>"
#And clicks submit
#Then Cohort is added

Examples:
|   Cohort Name             |        Cohort Acronym          |               Notes                             |
|   First Automated Cohort  |          FAC                   |     This Cohort Will Be Automated               |

@Progression

Scenario: Cohort Owner logs in and selects cohort
Given the user is on the CEDCD homepage
When the user is logged in as a Cohort Owner
And the Cohort Owner selects their Cohort questionnaire
Then Section A of the Questionnaire is filled out

 
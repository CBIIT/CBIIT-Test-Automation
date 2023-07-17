Feature: CCR Landing Page Scenarios

  Background: common steps
    Given User is on CCR Landing page and user is "internal user"

  @Nekrashevich @Regression @Smoke @landingPage
  Scenario: Verify CCR Landing Page items
    And User can see tabs displayed
    |Home|Positions|

  @Nekrashevich @Regression @Smoke @fillApplication
  Scenario Outline: Fill In An Application As An Internal User
    And User navigates to "Biostatistician" open vacancy
    And User clicks "Apply Now" button
    And User enters "<firstname>" into a first name field
    And User enter "<middlename>" into a middle name field
    And User enter "<lastname>" into a last name field
    And User enter "<email>" into an email field
    And User enter "<phone>" into a phone field
    And User enter "<businessphone>" into a business phone field
    And User enter "<degree(s)>" into a degree field
    And User enter "<otherdegree(s)>" into an other degree field
    And User confirms that User is a US Citizen
    And User clicks "Next" button

    Examples:
      | firstname | middlename | lastname | email           | phone      | businessphone |degree(s) | otherdegree(s) |
      | Elena     | Maria      | Beloli   | elena@gmail.com | 2012212343 | 2023323454    | BA       |   MBA          |


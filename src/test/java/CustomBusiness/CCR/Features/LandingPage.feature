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
    And User clicks Apply Now button
    And User enters "<firstname>" into a first name field
    And User enter "<middlename>" into a middle name field
    And User enter "<lastname>" into a last name field
    And User enter "<email>" into an email field
    And User enter "<phone>" into a phone field
    And User enter "<businessphone>" into a business phone field
    And User selects " Ph.D. " from a degree dropdown
    And User enter "<otherdegree(s)>" into an other degree field
    And User confirms that User is a US Citizen
    And User clicks Basic Information Section Next button
    And User enter "<address>" into an address field
    And User enter "<address2>" into an address2 field
    And User enter "<city>" into a city field
    And User enter "<state>" into a state field
    And User enter "<zip>" into a zip field
    And User selects United States from a country dropdown
    And User clicks Address Section Next button

    Examples:
      | firstname | middlename | lastname | email           | phone      | businessphone | otherdegree(s) | address   | address2 | city  | state | zip   |
      | Elena     | Maria      | Beloli   | elena@gmail.com | 2012212343 | 2023323454    | MBA            |  7 Mills  | Drive    | Reston| VA    | 20453 |


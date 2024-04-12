Feature: CTRP/CTRO Native View Case Test Scenarios

  @CTRPSNOW-81 @chaudhryma @Regression
  Scenario: Test Add Category / Subcategories to Case Forms
    Given a CTRP CTRO Helpdesk Case
    When users select 'Category'
    Then a new category called "NCI DCC Accrual Report" is added
    And following options are available in the Subcategory field when the NCI DCC Accrual Report Category is selected: "Account Related", "Data Review", "Feedback", "General Inquiries", "Policy Decision", "Technical Issues (CBIIT)", "Training"

  @CTRPSNOW-81 @chaudhryma @Progression
  Scenario: Test Case 'Category' Dropdown Field Options in Alphabetical order
    Given a user is on the CTRP CTRO Helpdesk Case form
    When users select 'Category'
    Then the 'NCI DCC Accrual Report' category option is placed ABOVE the 'On-hold Trials' category
    And all categories are displayed in alphabetical order

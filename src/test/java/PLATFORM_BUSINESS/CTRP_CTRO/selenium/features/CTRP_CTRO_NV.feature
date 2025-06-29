Feature: CTRP/CTRO Native View Case Test Scenarios

  @CTRPSNOW-81 @CTRPSNOW-116 @chaudhryma @Regression @selenium
  Scenario: Test Add Category / Subcategories to Case Forms
    Given a CTRP CTRO Helpdesk Case
    When users select 'Category'
    Then a new category called "NCI DCC Accrual Report" is added
    And following options are available in the Subcategory field when the NCI DCC Accrual Report Category is selected: "Access Additional NCI DCC Account", "Access Initial NCI DCC Account", "Access NCI Account", "Access Troubleshooting", "Data Refresh Outreach", "Data Review", "Feedback", "General Inquiries", "Policy Decision", "Technical Issues (CBIIT)", "Training"

  @CTRPSNOW-88 @chaudhryma @Regression @selenium
  Scenario: Test Case 'Category' Dropdown Field Options in Alphabetical order
    Given a user is on the CTRP CTRO Helpdesk Case form
    When users select 'Category'
    Then the 'NCI DCC Accrual Report' category option is placed ABOVE the 'On-hold Trials' category
    And all categories are displayed in alphabetical order

  @CTRPSNOW-127 @chaudhryma @Regression @selenium
  Scenario: New ‘FDAAA/NIH Policy Outreach' Category
    Given a user is on a CTRP CTRO Helpdesk Case
    When users select 'Category'
    Then User sees there is a Category available called 'FDAAA/NIH Policy Outreach'

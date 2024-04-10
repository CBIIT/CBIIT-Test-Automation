Feature: CTRP/CTRO Native View Case Test Scenarios

  @CTRPSNOW-81 @chaudhryma @Regression
  Scenario: Test Add Category / Subcategories to Case Forms
    Given a CTRP CTRO Helpdesk Case
    When users select 'Category'
    Then a new category called "NCI DCC Accrual Report" is added
    And following options are available in the Subcategory field when the NCI DCC Accrual Report Category is selected: "Account Related", "Data Review", "Feedback", "General Inquiries", "Policy Decision", "Technical Issues (CBIIT)", "Training"
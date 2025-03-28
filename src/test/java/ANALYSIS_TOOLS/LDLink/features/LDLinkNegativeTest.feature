Feature: These are the negative tests associated with LDLink

  @Smoke @Regression @playwright @NegativeTest
  Scenario: LDAssoc validation error
    Given the user is on the LDAssoc module
    When using example data and unselecting population
    Then the "Please select a population" validation error displays

  @Smoke @Regression @playwright @NegativeTest
  Scenario: LDExpress validation error
    Given the user is on the LDExpress module
    When calculating
    Then the "Please fill out this field." popup error displays
    When entering RS number "rs123" and calculating
    Then the "Please select a population" validation error displays
    When selecting YRI population and calculating
    Then the "Please select a tissue" validation error displays

  @Smoke @Regression @playwright @NegativeTest
  Scenario: LDHap validation error
    Given the user is on the LDHap module
    When calculating
    Then the "Please fill out this field." popup error displays
    When entering RS number "rs123" and calculating
    Then the "Please select a population" validation error displays

  @Smoke @Regression @playwright @NegativeTest
  Scenario: LDMatrix validation error
    Given the user is on the LDMatrix module
    When calculating
    Then the "Please fill out this field." popup error displays
    When entering RS number "rs123" and calculating
    Then the "Please select a population" validation error displays

  @Smoke @Regression @playwright @NegativeTest
  Scenario: LDPair validation error
    Given the user is on the LDPair module
    When calculating
    Then the "Please fill out this field." popup error displays
    When calculating after entering LDPair rs number "rs538233958" in first field
    Then the "Please fill out this field." popup error displays
    When calculating after entering LDPair rs number "rs2022099" in second field
    Then the "Please select a population" validation error displays

  @Smoke @Regression @playwright @NegativeTest
  Scenario: LDPop validation error
    Given the user is on the LDPop module
    When calculating
    Then the "Please fill out this field." popup error displays
    When calculating after entering LDPop rs number "rs538233958" in first field
    Then the "Please fill out this field." popup error displays
    When calculating after entering LDPop rs number "rs2022099" in second field
    Then the "Please select a population" validation error displays

  @Smoke @Regression @playwright @NegativeTest
  Scenario: LDProxy validation error
    Given the user is on the LDProxy module
    When calculating
    Then the "Please fill out this field." popup error displays
    When entering LDProxy rs number "rs538233958" and calculating
    Then the "Please select a population" validation error displays

  @Smoke @Regression @playwright @NegativeTest
  Scenario: LDTrait validation error
    Given the user is on the LDTrait module
    When calculating
    Then the "Please fill out this field." popup error displays
    When entering RS number "rs123" and calculating
    Then the "Please select a population" validation error displays

  @Smoke @Regression @playwright @NegativeTest
  Scenario: LDScores LDScore Calculation validation error
    Given the user is on the LDScore Calculation module
    When calculating with ones one fam file
    Then the "Three files in the format *.bed, *.bim, *.fam are required" error message on LDScore Calculation is displayed

  @Smoke @Regression @playwright @NegativeTest
  Scenario: LDScores Heritability Analysis validation error
    Given the user is on the LDScore modules Heritability Analysis tab
    When calculating
    Then the "Please select a population" validation error displays
    When calculating with "(EUR) European" population selected
    Then the "An error occurred while running the command: Traceback" error message is displayed

    ##THERE IS NO ERROR HANDLING FOR THIS MODULE YET -- WILL ADD VALIDATION ON LINE 92 WHEN THIS IS DEVELOPED
  @Smoke @Regression @playwright @NegativeTest
  Scenario: LDScores Genetic Correlation validation error
    Given the user is on the LDScore modules Genetic Correlation tab
    When calculating
    Then the "Please select a population" validation error displays
    When calculating with "(EUR) European" population selected
    Then the Genetic Correlation "THERE'S NO ERROR HANDLING HERE" text is displayed

  @Smoke @Regression @playwright @NegativeTest
  Scenario: SNPChip validation error
    Given the user is on the SNPChip module
    When calculating
    Then the "Please fill out this field." popup error displays

  @Smoke @Regression @playwright @NegativeTest
  Scenario: LDClip validation error
    Given the user is on the SNPClip module
    When calculating
    Then the "Please fill out this field." popup error displays
    When entering RS number "rs123" and calculating
    Then the "Please select a population" validation error displays
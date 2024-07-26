Feature: These are all the features for the BioMarker Tools application

  @NCIATWP-7884 @matakevin @Smoke @playwright
  Scenario: All navbar tabs are displayed
    Given the user is on the BioMarker home page
    Then the "Home", "Means to Risk", "Biomarker Comparison", "Risk Stratification Advanced Analysis", "Mean Risk Stratification", "Help" tabs are displayed

  @NCIATWP-7891 @matakevin @Smoke @playwright
  Scenario: Risk Stratification Advanced Analysis
    Given the user is on the BioMarker home page
    When the user navigates to the "Risk Stratification Advanced Analysis" tab
    And searches using "specificity" set to "0.5, 0.77, 0.81, 0.82, 0.98", "prevalence" set to "0.01, 0.05, 0.1", and "delta" set to "1, 1.25, 2.5, 3.5"
    Then the "Positive Predictive Value given specificity, prevalence, and delta" and the "Complement of the Negative Predictive Value given specificity, prevalence, and delta" are displayed

  @NCIATWP-7892 @matakevin @Smoke @playwright
  Scenario: Mean Risk Stratification displays Calculations
    Given the user is on the BioMarker home page
    When the user navigates to the "Mean Risk Stratification" tab
    And the user calculates using "Example 1" file
    Then the "Calculations" table displays

  @NCIATWP-7914 @matakevin @Progression @playwright
  Scenario: Help tab contents are displayed
    Given the user is on the BioMarker home page
    When the user navigates to the "Help" tab
    Then the "Tools Help", "FAQ", and "Glossary of Terms" links are displayed
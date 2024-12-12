Feature: These are the scenarios for cProSite's Explore Tab

  @Smoke @matakevin @selenium
  Scenario: User submit default selection
    Given user is on cProSite explore Tab
    When user clicks submit
    Then results is displayed

  @Smoke @matakevin @selenium
  Scenario: User submit selection with dataset as phosphorylation site
    Given user is on cProSite explore Tab
    When user changes the dataset to phosphorylation site
    And user clicks submit
    Then results is displayed

  @Smoke @matakevin @selenium
  Scenario: User submit selection with dataset as PhosphorylationProtein
    Given user is on cProSite explore Tab
    When user changes the dataset to phosphorylationprotein
    And user clicks submit
    Then results is displayed

  @Smoke @matakevin @selenium
  Scenario: User submit selection with RNALevel CDK1 mRNa to another and DLC1
    Given user is on cProSite explore Tab
    When user changes the dataset to rnalevel
    And  user change analysis to correlation
    And user change correlated gene to DLC1
    And user clicks submit
    Then results is displayed

  @Smoke @matakevin @selenium
  Scenario: User submit selection with RNALevel CDK1 Protein and mRNA and DLC1
    Given user is on cProSite explore Tab
    When user changes the dataset to rnalevel
    And  user change analysis to correlation
    And user select protein and mRNA
    And user clicks submit
    Then results is display tumortype

  @Smoke @matakevin @selenium
  Scenario: User submit selection with Relative Protein Abundance correlation CDK1 to another protein and DLC1
    Given user is on cProSite explore Tab
    When  user change analysis to correlation
    And user change correlated gene to DLC1
    And user clicks submit
    Then results is displayed

  @Smoke @matakevin @selenium
  Scenario: User submit selection with Phosphorylation Site  correlation CDK1 to another protein and DLC1
    Given user is on cProSite explore Tab
    When user changes the dataset to phosphorylation site
    And  user change analysis to correlation
    And user change correlated gene to DLC1
    And user clicks submit
    Then results is displayed

  @Smoke @matakevin @selenium
  Scenario: User reset calculation
    Given user is on cProSite explore Tab
    When user changes the dataset to phosphorylation site
    And  user change analysis to correlation
    And user change correlated gene to DLC1
    And user clicks submit
    And user click reset button
    Then page is reset

  @Smoke @matakevin @selenium
  Scenario: User export data
    Given user is on cProSite explore Tab
    When user clicks submit
    And user clicks export button
    Then verify dataset download "Protein_Abundance_Tumor_vs_Normal-CDK1.xlsx"

  @Smoke @Regression @matakevin @selenium
  Scenario: User submit selection with Correlation Gene Correlated Gene
    Given user is on cProSite explore Tab
    When user change analysis to correlation
    And user change Gene
    And user change correlated gene to DLC1
    And user clicks submit
    Then results is displayed

  @Smoke @Regression @matakevin @selenium
  Scenario: User selects just brain cancer
    Given user is on cProSite explore Tab
    When user removes all tumor types
    And user selects brain cancer
    And user clicks submit
    Then results is displayed
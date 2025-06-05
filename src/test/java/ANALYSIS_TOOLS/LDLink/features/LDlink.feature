Feature: These are the test cases for the LDlink application

  @Smoke @Regression @matakevin @selenium
  Scenario: Analysis Tools Page - Validate LDlink
    Given a LDlink user opens Analysis Tools page
    Then user verifies "LDLink" present on the screen
    Then user verifies the description "A suite of web-based applications designed to easily and efficiently explore linkage disequilibrium in population subgroups. All population genotype data originates from Phase 3 of the 1000 Genomes Project and variant RS numbers are indexed based on dbSNP build 151."

  @Smoke @Regression @matakevin @selenium ## will delete if the following is a dupe test
  Scenario: User navigates from landing page to home page
    Given a LDlink user opens Analysis Tools page
    When user clicks LDLink on landing page
    Then User verifies title is "LDlink is a suite of web-based applications designed to easily and efficiently interrogate linkage disequilibrium in population groups. Each included application is specialized for querying and displaying unique aspects of linkage disequilibrium."

  @Smoke @Regression @matakevin @selenium
  Scenario: Home Page - Validate LDlink
    When a LDlink user opens home page
    Then User verifies title is "LDlink is a suite of web-based applications designed to easily and efficiently interrogate linkage disequilibrium in population groups. Each included application is specialized for querying and displaying unique aspects of linkage disequilibrium."

  @Smoke @Regression @matakevin @selenium @NCIATWP-8678
  Scenario: Calculating the example file on LDassoc
    Given a LDlink user opens home page
    When the user clicks on the LDassoc module
    When the user calculates example GWAS data on the LDassoc page
    Then the "Association Results" text displays

  @matakevin @NEEDSREVIEW @selenium @NCIATWP-8933
  Scenario: Uploading the firewall limit txt file to LDassoc
    Given a LDlink user opens home page
    When the user clicks on the LDassoc module
    And the user uploads "./src/test/resources/prostate_example_grch37.txt", selects Variant drop down, enters "rs7837688" and YRI population and calculates
    Then the "Association Results" text displays

  @Smoke @Regression @matakevin @selenium @NCIATWP-8934
  Scenario: Testing expected warning message on LDexpress
    Given a LDlink user opens home page
    When the user clicks on the LDexpress module
    And the user calculates using RS numbers "rs187103513", "rs73062623", "rs17880489","rs1457504894" and GRCh38 High Coverage for genome build, CHB for population and Brain for tissue, and clicks on Variants with Warnings Link
    Then the "No entries in GTEx are identified using the LDexpress search criteria." and "Variant is not in 1000G reference panel." warning messages display

  @Smoke @Regression @playwright @NCIATWP-8871
    Scenario: Test LDscore: Add Sample Format links
    Given the user is on the LDscore module on LDlink
    Then the link "Click here for sample format" is displayed
    When the user clicks on "Click here for sample format"
    Then the user is on the Documentation page with the LDscore text displayed
    When the user clicks on the LDscore Calculation link
    Then the link "Click here for sample format" is displayed
    When the user clicks on "Click here for sample format"
    Then the user is on the Documentation page with the LDscore text displayed
    When the user clicks on the Genetic Correlation link
    Then the link "Click here for sample format" is displayed
    When the user clicks on "Click here for sample format"
    Then the user is on the Documentation page with the LDscore text displayed

  ## This is the start to the LDlink Negative test cases for the whole site

  @Smoke @Regression @playwright @NegativeTest @NCIATWP-8935
  Scenario: LDAssoc validation error
    Given the user is on the LDAssoc module
    When using example data and unselecting population
    Then the "Please select a population" validation error displays

  @Smoke @Regression @playwright @NegativeTest @NCIATWP-8936
  Scenario: LDExpress validation error
    Given the user is on the LDExpress module
    When calculating
    Then the "Please fill out this field." popup error displays
    When entering RS number "rs123" and calculating
    Then the "Please select a population" validation error displays
    When selecting YRI population and calculating
    Then the "Please select a tissue" validation error displays

  @Smoke @Regression @playwright @NegativeTest @NCIATWP-8937
  Scenario: LDHap validation error
    Given the user is on the LDHap module
    When calculating
    Then the "Please fill out this field." popup error displays
    When entering RS number "rs123" and calculating
    Then the "Please select a population" validation error displays

  @Smoke @Regression @playwright @NegativeTest @NCIATWP-8938
  Scenario: LDMatrix validation error
    Given the user is on the LDMatrix module
    When calculating
    Then the "Please fill out this field." popup error displays
    When entering RS number "rs123" and calculating
    Then the "Please select a population" validation error displays

  @Smoke @Regression @playwright @NegativeTest @NCIATWP-8939
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

  @Smoke @Regression @playwright @NegativeTest @NCIATWP-8940
  Scenario: LDProxy validation error
    Given the user is on the LDProxy module
    When calculating
    Then the "Please fill out this field." popup error displays
    When entering LDProxy rs number "rs538233958" and calculating
    Then the "Please select a population" validation error displays

  @Smoke @Regression @playwright @NegativeTest @NCIATWP-8941
  Scenario: LDTrait validation error
    Given the user is on the LDTrait module
    When calculating
    Then the "Please fill out this field." popup error displays
    When entering RS number "rs123" and calculating
    Then the "Please select a population" validation error displays

  @Smoke @Regression @playwright @NegativeTest @NCIATWP-8942
  Scenario: LDScores LDScore Calculation validation error
    Given the user is on the LDScore Calculation module
    When calculating with one fam file
    Then the "Three files in the format *.bed, *.bim, *.fam are required" error message on LDScore Calculation is displayed

  @Smoke @Regression @playwright @NegativeTest @NCIATWP-8943
  Scenario: LDScores Heritability Analysis validation error
    Given the user is on the LDScore modules Heritability Analysis tab
    When calculating
    Then the "Please select a population" validation error displays
    When calculating with "(EUR) European" population selected
    Then the "An error occurred while running the command: Traceback" error message is displayed

    ##THERE IS NO ERROR HANDLING FOR THIS MODULE YET -- WILL ADD VALIDATION ON LINE 92 WHEN THIS IS DEVELOPED
  @Smoke @Regression @playwright @NegativeTest @NCIATWP-8944
  Scenario: LDScores Genetic Correlation validation error
    Given the user is on the LDScore modules Genetic Correlation tab
    When calculating
    Then the "Please select a population" validation error displays
    When calculating with "(EUR) European" population selected
    Then the Genetic Correlation "THERE'S NO ERROR HANDLING HERE" text is displayed

  @Smoke @Regression @playwright @NegativeTest @NCIATWP-8945
  Scenario: SNPChip validation error
    Given the user is on the SNPChip module
    When calculating
    Then the "Please fill out this field." popup error displays

  @Smoke @Regression @playwright @NegativeTest @NCIATWP-8946
  Scenario: LDClip validation error
    Given the user is on the SNPClip module
    When calculating
    Then the "Please fill out this field." popup error displays
    When entering RS number "rs123" and calculating
    Then the "Please select a population" validation error displays

    ## This is the start to the API test cases for LDlink

  @inProgress @matakevin @selenium
  Scenario: POST Request for LDLinks LDExpress API Module
    When the POST requests for LDExpress is sent
    Then the 200 status is returned for LDExpress

  @Smoke @Regression @matakevin @selenium
  Scenario: GET Request for LDLinks LDHap API Module
    When the GET requests for LDHap is sent
    Then the 200 status is returned for LDHap

  @inProgress @matakevin @selenium
  Scenario: GET Request for LDLinks LDMatrix API Module
    When the GET requests for LDMatrix is sent
    Then the 200 status is returned for LDMatrix GET call

  @inProgress @matakevin @selenium
  Scenario: POST Request for LDLinks LDMatrix API Module
    When the POST requests for LDMatrix is sent
    Then the 201 status is returned for LDMatrix POST call

  @Smoke @Regression @matakevin @selenium
  Scenario: GET Request for LDLinks LDPair API Module
    When the GET requests for LDPair is sent
    Then the 200 status is returned for LDPair GET call

  @inProgress @matakevin @selenium
  Scenario: POST Request for LDLinks LDPair API Module
    When the POST requests for LDPair is sent
    Then the 201 status is returned for LDPair POST call

  @inProgress @matakevin @selenium
  Scenario: GET Request for LDLinks LDPop API Module
    When the GET requests for LDPop is sent
    Then the 200 status is returned for LDPop

  @inProgress @matakevin @selenium
  Scenario: GET Request for LDLinks LDProxy API Module
    When the GET requests for LDProxy is sent
    Then the 200 status is returned for LDProxy

  @inProgress @matakevin @selenium
  Scenario: POST Request for LDLinks SNPChip API Module
    When the POST requests for SNPChip is sent
    Then the 201 status is returned for SNPChip

  @inProgress @matakevin @selenium
  Scenario: POST Request for LDLinks SNPClip API Module
    When the POST requests for SNPClip is sent
    Then the 201 status is returned for SNPClip
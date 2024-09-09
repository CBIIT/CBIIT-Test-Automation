Feature: These are the PlayWright scenarios for the ICDGenie Application

  @NCIATWP-6358 @matakevin @Progression @playwright
  Scenario: API Access Page Search API works
    Given the user is on the ICDGenie home page
    When the user navigates to the API Access page
    And executes Search API call
    Then the status code is "200"

  @NCIATWP-6358 @matakevin @Progression @playwright
  Scenario: API Access Page Batch Query API works
    Given the user is on the ICDGenie home page
    When the user navigates to the API Access page
    And executes Batch Query API call
    Then the status codes is "200"

  @NCIATWP-6501 @matakevin @inProgress
  Scenario:2
    Given the user is on the "API Access" tab on ICDGenie
    When the user trys out the Search sections "POST" box
    Then the "Curl" text box is displayed
    When the user trys out the Batch Export sections "POST" box
    Then the "Curl" text box is displayed

  @NCIATWP-6783 @matakevin @inProgress
  Scenario:3
    Given the user is on the ICDGenie Getting Started page
    When the user navigates to the Tutorials sections of page
    Then both videos are attached

  @NCIATWP-4538 @matakevin @inProgress
  Scenario:4
    Given the user is on the ICDGenie home page
    Then the "Accurate histological classification is important for facilitating studies of cancer epidemiology and etiologic heterogeneity. ICD Genie is a web-based tool that can assist epidemiologists, pathologists, research assistants, and data scientists to more easily access, translate and validate codes and text descriptions from the International Classification of Diseases (10th Edition) and International Classification of Diseases for Oncology, 3rd Edition (ICD-O-3). By improving accessibility and making existing cancer classification and coding schemes to be more readily understandable and searchable, ICD Genie will help accelerate descriptive and molecular epidemiological studies of cancer."
    When the user enters "Stomach" in the home pages search bar
    Then the "Index Table", "Neoplasm Table", "Drug Table", and "Injury Table" are displayed


  @NCIATWP-4676 @matakevin @inProgress
  Scenario:5
    Given TBD


  @NCIATWP-5584 @matakevin @inProgress
  Scenario:6
    Given the user is on ICD Genies "Search" page
    When the user searches "Breast Cancer"
    Then the "Malignant melanoma of skin" is a result returned
    Then "ICD-10 Hierachy" is not displayed


  @NCIATWP-4678 @matakevin @inProgress
  Scenario:7
    Given TBD

  @NCIATWP-6388 @matakevin @inProgress
  Scenario:8
    Given the user is on the ICDGenie Batch Query page
    When the user submits using the "file location" file to the field and selects Participant ID for ICD-10 codes
    Then the Participant ID column is displayed in descending order
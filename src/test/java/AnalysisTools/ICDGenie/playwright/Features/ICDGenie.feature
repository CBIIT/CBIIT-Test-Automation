Feature: These are the PlayWright scenarios for the ICDGenie Application

  @NCIATWP-6358 @matakevin @Smoke @Regression @playwright
  Scenario: API Access Page Search API works
    Given the user is on the ICDGenie home page
    When the user is on the "API Access" tab on ICDGenie
    And executes Search API call
    Then the status code is "200"

  @NCIATWP-6358 @matakevin @Smoke @Regression @playwright
  Scenario: API Access Page Batch Query API works
    Given the user is on the ICDGenie home page
    When the user is on the "API Access" tab on ICDGenie
    And executes Batch Query API call
    Then the status codes is "200"

  @NCIATWP-6501 @matakevin @Smoke @Regression @playwright
  Scenario:Add default example to API Access
    Given the user is on the ICDGenie home page
    When the user is on the "API Access" tab on ICDGenie
    When the user trys out the Search sections POST box
    Then the Curl text box on Search is displayed
    When the user trys out the Batch Export sections POST box
    Then the Curl text box on Batch Export is displayed

  @NCIATWP-6783 @matakevin @Smoke @Regression @playwright
  Scenario:Verify videos are displayed on the Getting Started Page
    Given the user is on the ICDGenie home page
    When the user is on the Getting Started tab on ICDGenie
    When the user navigates to the Tutorials sections of page
    Then both videos are attached

  @NCIATWP-4538 @matakevin @Smoke @playwright
  Scenario: Home page search
    Given the user is on the ICDGenie home page
    When the user enters "Stomach" in the home pages search bar
    Then the "INDEX TABLE", "NEOPLASM TABLE", "DRUG TABLE", and "INJURY TABLE" are displayed


  @NCIATWP-4676 @matakevin @Smoke @playwright
  Scenario:About page text is displayed
    When the user navigates to the About page
    Then the "Accurate histological classification is important for facilitating studies of cancer epidemiology and etiologic heterogeneity. ICD Genie is a web-based tool that can assist epidemiologists, pathologists, research assistants, and data scientists to access and validate codes and text descriptions from the International Classification of Diseases (10th Edition) (ICD-10) and International Classification of Diseases for Oncology, 3rd Edition (ICD-O-3) more easily.", "Although many of the early classification and coding conventions have remained unchanged in successive versions of ICD and ICD-O, substantial revisions have been made in more recent versions i.e., ICD-10 and ICD-O-3. Tumor-related information may be available only in pathology reports, in text formats, or as ICD codes, which can be difficult to translate and record for non-specialists. The lack of a web-based tool for the batch translation of ICD codes to textual diagnoses is particularly challenging for large-scale epidemiological and public health projects that are often based on ICD codes derived from medical records for hundreds to thousands of individuals.", "To address these challenges, we developed ICD Genie as a publicly available web tool to facilitate the translation of ICD-10 and ICD-O-3 codes to human-readable text. By improving accessibility and by making existing cancer classification and coding schemes more readily understandable and searchable, ICD Genie will help accelerate descriptive and molecular epidemiological studies of cancer. The incorporation of ICD-10 in ICD Genie renders the tool useful for studies of other non-neoplastic diseases.", "ICD Genie is not intended to be used by cancer registrars or for cancer surveillance purposes. Cancer registrars should visit the Surveillance, Epidemiology, and End Results Program website (https://seer.cancer.gov/) for more information about coding guidelines and resources.", "2. Resources", and "3. Contact Information" About page text is displayed

  @NCIATWP-5584 @matakevin @Smoke @playwright
  Scenario:Updating Search Function and Page
    Given the user is on ICDGenies Search page
    When the user searches "Breast Cancer"
    Then the "Malignant melanoma of skin" is a result returned

  @NCIATWP-6501 @matakevin @Progression @playwright
  Scenario: Test ICDGenie: Add default example to API Access
    Given the user is on the "API Access" tab on ICDGenie
    When the user trys out the Search sections "POST" box
    Then the "Curl" text box is displayed
    When the user trys out the Batch Export sections "POST" box
    Then the "Curl" text box is displayed

  @NCIATWP-6388 @matakevin @Smoke @playwright
  Scenario:Batch query results
    When the user is on the ICDGenie Batch Query page
    When the user submits using the "src/test/java/AnalysisTools/ICDGenie/Resources/icdgenie_example_icd10_patient_id (3).tsv" file to the field and selects Participant ID for ICD10 codes
    Then the "10 Results Found" text and the "Export Results" button are displayed
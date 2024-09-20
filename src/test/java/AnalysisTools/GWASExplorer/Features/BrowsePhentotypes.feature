Feature: Test cases on the Browse Phenotype page

  @Smoke1 @matakevin
  Scenario: User on Browse Phenotype Tab
    Given the user is on the GWAS Explorer home page
    When user clicks browse phenotype tab
    Then browse phenotype page displays "Please select a phenotype"


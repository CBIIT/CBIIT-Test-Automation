Feature: These are the scenario for the Analysis Page on GWAS Target

  @Smoke @matakevin
  Scenario: The user submits the sample job
    Given the user is on the GWAS Target Analysis page
    When the user submits the sample job
    Then the "Your analysis has been submitted" text and the "Gene Analysis" tab are displayed

  @Smoke @matakevin
  Scenario: The user submits a job to the queue
    Given the user is on the GWAS Target Analysis page
    When the user submits the sample job to the queue with "Automation Test" as job name and "Kevin.MataRodriguez@NIH.gov" as queue email
    Then the "Your job is submitted and you will receive an email when the results are available." successful queue submission prompt is displayed
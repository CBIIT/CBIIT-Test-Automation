Feature: These scenarios are for the Home page of GWAS Target

  @Smoke @matakevin @selenium
  Scenario: Home page body text is displayed
    When the user is on the GWAS Target home page
    Then the home page "GWAS Target is a web tool that seamlessly takes GWAS summary statistics and incorporates a complex multidimensional approach to prioritize target genes involving the latest epigenome mapping data across different tissues and epigenomic datasets.", "GWASTarget was developed by Charles Breeze in collaboration with NCI's Center for Biomedical Informatics and Information Technology (CBIIT). Support comes from the Division of Cancer Epidemiology and Genetics Informatics Tool Challenge." and "Questions or comments? Contact Charles Breeze via c.breeze@ucl.ac.uk" text is displayed


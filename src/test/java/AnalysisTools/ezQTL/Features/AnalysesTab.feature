Feature: Scenarios under the Analyses tab on ezQTL
    @Smoke @matakevin
    Scenario:Submitting queue using User provided sample files
        Given The user is on the ezQTL Analyses page
        When the user submits "/Users/matarodriguezko/CBIIT-Test-Automation/src/test/resources/ezQTLResources/MX2.eQTL.txt", "/Users/matarodriguezko/CBIIT-Test-Automation/src/test/resources/ezQTLResources/MX2.GWAS.txt", "/Users/matarodriguezko/CBIIT-Test-Automation/src/test/resources/ezQTLResources/MX2.quantification.txt", "/Users/matarodriguezko/CBIIT-Test-Automation/src/test/resources/ezQTLResources/MX2.genotyping.txt", "/Users/matarodriguezko/CBIIT-Test-Automation/src/test/resources/ezQTLResources/MX2.LD.gz". "100", "" "Automation Job", "kevin.matarodriguez@nih.gov"
        Then the "Your job was successfully submitted to the queue. You will recieve an email at kevin.matarodriguez@nih.gov with your results." text is displayed

    @Smoke @matakevin
    Scenario:Submitting queue using public data files
        Given The user is on the ezQTL Analyses page
        When the user searches using public data
        Then the "Your job was successfully submitted to the queue. You will recieve an email at kevin.matarodriguez@nih.gov with your results." text is displayed

    @Smoke @matakevin
    Scenario:Calculating with example files
        Given The user is on the ezQTL Analyses page
        When the user clicks on the Load Sample Data link
        Then the "Locus QC", "Locus LD", "Locus Alignment", "Locus Colocalization", "Locus Table", "Locus Quantification", "Locus Download" text is displayed
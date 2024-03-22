Feature: Scenarios under the Analyses tab on ezQTL

    @Smoke @matakevin
    Scenario:Submitting queue using User provided sample files
        Given The user is on the ezQTL Analyses page
        When the user submits "/src/test/resources/ezQTLResources/MX2.eQTL.txt", "/src/test/resources/ezQTLResources/MX2.GWAS.txt", "/src/test/resources/ezQTLResources/MX2.quantification.txt", "/src/test/resources/ezQTLResources/MX2.genotyping.txt", "/src/test/resources/ezQTLResources/MX2.LD.gz", "100", "" "Automation Job", "kevin.matarodriguez@nih.gov"
        Then the "Your job was successfully submitted. You will receive an email at kevin.matarodriguez@nih.gov with your results." text is displayed

    @Smoke @matakevin
    Scenario:Submitting queue using public data files
        Given The user is on the ezQTL Analyses page
        When the user searches using public data
        Then the "Your job was successfully submitted. You will receive an email at kevin.matarodriguez@nih.gov with your results." text is displayed

    @Smoke @matakevin
    Scenario:Calculating with example files
        Given The user is on the ezQTL Analyses page
        When the user clicks on the Load Sample Data link
        Then the "Locus QC", "Locus LD", "Locus Alignment", "Locus Colocalization", "Locus Table", "Locus Quantification", "Locus Download" texts is displayed

    @Smoke @matakevin
    Scenario:Calculating multiple locus jobs
        Given The user is on the ezQTL Analyses page
        When the user searches using public data and five locus parameters
        Then the "Your job was successfully submitted. You will receive an email at kevin.matarodriguez@nih.gov with your results." text is displayed

    @Smoke @matakevin
    Scenario:Download Links are clickable and display correctly
        Given The user is on the ezQTL Analyses page
        When the user clicks on the Load Sample Data link
        Then the both download links are clickable

    @Smoke @matakevin
    Scenario:Calculating on Analyses' Locus LD tab
        Given The user is on the ezQTL Analyses page
        When the user clicks on the Load Sample Data link
        And recalculates on the Locus LD
        Then the "Download Plot" link is displayed

    @matakevin @NEEDSREVIEW
    Scenario:Recalculate on all Analyses tabs
        Given The user is on the ezQTL Analyses page
        When the user clicks on the Load Sample Data link
        And recalculates on the Locus LD

    @matakevin @NEEDSREVIEW #FILE NEEDS TO BE ADDED TO ezQTL RESOURCES
    Scenario:Submitting queue however many specified times
        Given The user is on the ezQTL Analyses page
        Then the user submits "/Users/matarodriguezko/Downloads/SLC52A2_eQTL_res_for_ezQTL_Female.txt", "1000", "145577796", "Long Running Job", "kevin.matarodriguez@nih.gov", 40 times

    @Smoke @matakevin
    Scenario:Submitting queue however many specified times
        Given The user is on the ezQTL Analyses page
        Then the user submits "1000", "42743496", "Parallel tests", "kevin.matarodriguez@nih.gov", 40 times
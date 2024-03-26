Feature: Scenarios under the Documentation tab on ezQTL

    @Smoke @matakevin
    Scenario:Documentation tab displays the correct columns
        Given The user is on the ezQTL Documentation page
        Then the values "Release History", "Input File Format of ezQTL", "QTL Association Data", "Quantification Data", "Genotype Data", "LD Matrix Data", "GWAS Data", "Public Data Source", "Relationship Between Input Datasets and Module Functions", "Colocalization Analysis", "Comparison Between ezQTL and Other Tools", "Frequently Asked Questions" are displayed
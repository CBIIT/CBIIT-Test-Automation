Feature: Scenarios under the Documentation tab on ezQTL

    @Smoke @matakevin @selenium
    Scenario:Columns under the Public Data Source tab are displayed as expected
        Given The user is on the ezQTL Public Data Source page
        Then the columns displayed are "Dataset", "Type", "Population", "Genome Build", "Journal", "Year", "Title", and "Study Website"
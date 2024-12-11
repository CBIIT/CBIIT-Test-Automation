Feature: These scenarios verifiy LDLink Homepage and Landing Page Validation

    @Smoke @Regression @matakevin @selenium
    Scenario: Analysis Tools Page - Validate LDlink
        Given a LDlink user opens Analysis Tools page
        Then user verifies "LDLink" present on the screen
        Then user verifies the description "A suite of web-based applications designed to easily and efficiently explore linkage disequilibrium in population subgroups. All population genotype data originates from Phase 3 of the 1000 Genomes Project and variant RS numbers are indexed based on dbSNP build 151."

    @Smoke @Regression @matakevin @selenium
    Scenario: User navigates from landing page to home page
        Given a LDlink user opens Analysis Tools page
        When user clicks LDLink on landing page
        Then User verify title is "LDlink is a suite of web-based applications designed to easily and efficiently interrogate linkage disequilibrium in population groups. Each included application is specialized for querying and displaying unique aspects of linkage disequilibrium."

    @Smoke @Regression @matakevin @selenium
    Scenario: Home Page - Validate LDlink
        When a LDlink user opens home page
        Then User verify title is "LDlink is a suite of web-based applications designed to easily and efficiently interrogate linkage disequilibrium in population groups. Each included application is specialized for querying and displaying unique aspects of linkage disequilibrium."
Feature: Scenarios under the Home page on ezQTL

    @Smoke @matakevin
    Scenario:Home tab displays all tabs
        Given The user is on the ezQTL Home page
        Then the values "Home", "Analyses", "Public Data Source" and "Documentation" are displayed

    @Smoke @matakevin
    Scenario:Credits on Home tab display as expected
        Given The user is on the ezQTL Home page
        Then the credits section contains "Tongwu Zhang", "Jiyeon Choi", and "Kevin Brown"
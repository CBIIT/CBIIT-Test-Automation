Feature: This feature file encompasses test cases on the LDexpress module of LDlink

    @Smoke @Regression @matakevin @selenium
    Scenario: Testing expected warning message on LDexpress
        Given a LDlink user opens home page
        When the user clicks on the LDexpress module
        And the user calculates using RS numbers "rs187103513", "rs73062623", "rs17880489","rs1457504894" and GRCh38 High Coverage for genome build, CHB for population and Brain for tissue, and clicks on Variants with Warnings Link
        Then the "No entries in GTEx are identified using the LDexpress search criteria." and "Variant is not in 1000G reference panel." warning messages display
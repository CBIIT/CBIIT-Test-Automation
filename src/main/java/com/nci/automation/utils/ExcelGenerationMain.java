package com.nci.automation.utils;

import java.io.File;

public class ExcelGenerationMain {

    public static void main(String[] args) {
        System.out.println("Generating Excel report...");

        // Use system properties or fallback to default file names
        String jsonFileName = System.getProperty("jsonFile", "target/cucumber.json");
        String excelFileName = System.getProperty("excelFile", "target/cucumber_results.xlsx");

        File cucumberJson = new File(jsonFileName);

        // Validate that the JSON file exists and is non-empty
        if (!cucumberJson.exists() || cucumberJson.length() == 0) {
            System.err.println("ERROR: JSON file '" + jsonFileName + "' is missing or empty. Cannot generate Excel report.");
            return;
        }

        try {
            // Pass the parameterized file names to the CucumberResultParserToExcel program
            CucumberResultParserToExcel.main(new String[]{jsonFileName, excelFileName});
            System.out.println("Excel report generated successfully at: " + excelFileName);
        } catch (Exception e) {
            System.err.println("ERROR: Excel generation failed - " + e.getMessage());
            e.printStackTrace();
        }
    }
}
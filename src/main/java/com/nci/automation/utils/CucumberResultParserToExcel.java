package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CucumberResultParserToExcel {

    public static void main(String[] args) {
        // Path to the generated cucumber.json file
        File cucumberJsonFile = new File("target/cucumber.json");

        // The XLSX file where extracted results will be stored
        File excelFile = new File("cucumber_results.xlsx");

        // Initialize counters for totals
        int totalScenarios = 0;
        int passedScenarios = 0;
        int failedScenarios = 0;

        try (FileOutputStream fileOut = new FileOutputStream(excelFile);
             Workbook workbook = new XSSFWorkbook()) {

            // Create a sheet in the workbook
            Sheet sheet = workbook.createSheet("Test Results");

            // Write the header row
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Feature");
            headerRow.createCell(1).setCellValue("Scenario Name");
            headerRow.createCell(2).setCellValue("Status");

            // Parse the JSON file using Jackson ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(cucumberJsonFile);

            // Initialize row counter for Excel
            int rowCounter = 1;

            // Iterate through all features
            for (JsonNode feature : rootNode) {
                String featureName = feature.get("name").asText();

                JsonNode elements = feature.get("elements"); // Scenarios under the feature
                if (elements != null) {
                    for (JsonNode scenario : elements) {
                        // Extract scenario details
                        String scenarioName = scenario.get("name").asText();
                        totalScenarios++;

                        // Check each step's result to determine the scenario status
                        boolean scenarioPassed = true; // Assume it passed unless a step failed
                        JsonNode steps = scenario.get("steps");
                        for (JsonNode step : steps) {
                            String status = step.get("result").get("status").asText();
                            if ("failed".equals(status)) {
                                scenarioPassed = false;
                            }
                        }

                        // Determine status and update counters
                        String finalStatus = scenarioPassed ? "Passed" : "Failed";
                        if (scenarioPassed) {
                            passedScenarios++;
                        } else {
                            failedScenarios++;
                        }

                        // Write the data to the Excel sheet
                        Row row = sheet.createRow(rowCounter++);
                        row.createCell(0).setCellValue(featureName);
                        row.createCell(1).setCellValue(scenarioName);
                        row.createCell(2).setCellValue(finalStatus);
                    }
                }
            }

            // Summary in console
            System.out.println("Total Scenarios: " + totalScenarios);
            System.out.println("Passed Scenarios: " + passedScenarios);
            System.out.println("Failed Scenarios: " + failedScenarios);

            // Auto-size the columns
            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);

            // Write to the Excel file
            workbook.write(fileOut);
            System.out.println("Results successfully written to: " + excelFile.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
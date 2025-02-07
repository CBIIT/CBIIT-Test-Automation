package com.nci.automation.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class CucumberResultParserToExcel {

    public static void main(String[] args) {
        // Get JSON and Excel file names from arguments or system properties
        String jsonFileName = args.length > 0 ? args[0] : System.getProperty("jsonFile", "target/cucumber.json");
        String excelFileName = args.length > 1 ? args[1] : System.getProperty("excelFile", "target/cucumber_results.xlsx");

        File jsonFile = new File(jsonFileName);
        File excelFile = new File(excelFileName);

        // Debugging: Log the file paths
        System.out.println("Reading JSON File: " + jsonFile.getAbsolutePath());
        System.out.println("Writing Excel File: " + excelFile.getAbsolutePath());

        // Initialize counters
        int totalScenarios = 0;
        int passedScenarios = 0;
        int failedScenarios = 0;
        Map<String, int[]> featureCounters = new HashMap<>(); // Tracks per-feature totals

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MM/dd/yyyy HH:mm:ss");
        String executionTimestamp = LocalDateTime.now().format(formatter);

        // Ensure JSON file exists and is non-empty
        if (!jsonFile.exists() || jsonFile.length() == 0) {
            System.err.println("ERROR: JSON file '" + jsonFileName + "' is missing or empty. Exiting...");
            return;
        }

        try (FileOutputStream fileOut = new FileOutputStream(excelFile); Workbook workbook = new XSSFWorkbook()) {
            // Create an Excel sheet
            Sheet sheet = workbook.createSheet("Test Results");

            // Create the header row
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Feature");
            headerRow.createCell(1).setCellValue("Scenario");
            headerRow.createCell(2).setCellValue("Status");
            headerRow.createCell(3).setCellValue("Total Passed");
            headerRow.createCell(4).setCellValue("Total Failed");
            headerRow.createCell(5).setCellValue("Total Executed");
            headerRow.createCell(6).setCellValue("Execution Timestamp");

            // Parse JSON file
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(jsonFile);

            // Ensure JSON is not empty
            if (rootNode == null || !rootNode.isArray() || rootNode.size() == 0) {
                System.err.println("ERROR: JSON file has no usable data. Exiting...");
                return;
            }

            int rowCounter = 1; // Start at row 1 for data

            for (JsonNode feature : rootNode) {
                String featureName = feature.get("name").asText();
                System.out.println("Processing Feature: " + featureName);

                featureCounters.putIfAbsent(featureName, new int[]{0, 0}); // Passed, Failed counters for this feature
                JsonNode scenarios = feature.get("elements");

                if (scenarios != null) {
                    for (JsonNode scenario : scenarios) {
                        String scenarioName = scenario.get("name").asText();
                        totalScenarios++;
                        System.out.println("Processing Scenario: " + scenarioName);

                        boolean scenarioPassed = true; // Assume passed unless proven otherwise

                        JsonNode steps = scenario.get("steps");
                        for (JsonNode step : steps) {
                            String status = step.get("result").get("status").asText();
                            if ("failed".equalsIgnoreCase(status)) {
                                scenarioPassed = false; // Mark as failed
                            }
                        }

                        String resultStatus = scenarioPassed ? "Passed" : "Failed";
                        if (scenarioPassed) {
                            passedScenarios++;
                            featureCounters.get(featureName)[0]++;
                        } else {
                            failedScenarios++;
                            featureCounters.get(featureName)[1]++;
                        }

                        int totalExecuted = featureCounters.get(featureName)[0] + featureCounters.get(featureName)[1];

                        // Write details into Excel
                        Row row = sheet.createRow(rowCounter++);
                        row.createCell(0).setCellValue(featureName);
                        row.createCell(1).setCellValue(scenarioName);
                        row.createCell(2).setCellValue(resultStatus);
                        row.createCell(3).setCellValue(featureCounters.get(featureName)[0]);
                        row.createCell(4).setCellValue(featureCounters.get(featureName)[1]);
                        row.createCell(5).setCellValue(totalExecuted);
                        row.createCell(6).setCellValue(executionTimestamp);
                    }
                }
            }

            // Autosize columns
            for (int i = 0; i <= 6; i++) {
                sheet.autoSizeColumn(i);
            }

            // Write workbook
            workbook.write(fileOut);
            System.out.println("Excel file created successfully at: " + excelFile.getAbsolutePath());

        } catch (IOException e) {
            System.err.println("ERROR: Failed to generate Excel file - " + e.getMessage());
            e.printStackTrace();
        }
    }
}
package com.nci.automation.utils;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.nci.automation.common.StepType;

public class Report {

	private static ExtentReports report;
	private static ExtentTest feature;	
	private static ExtentTest scenario;
	private static String resultsPath;
	private static ExtentSparkReporter html;
	private static boolean isReportInitiated = false;
	
	public static void initReport() {
		if(isReportInitiated)
			return;
		String timeStamp = DateUtils.getFormatedDate("MMddyyyy_HHmmss");
		resultsPath = "/reports/Run_"+timeStamp;
		if(!new File(resultsPath).isDirectory())
			new File(resultsPath).mkdirs();
		isReportInitiated = true;
	}
	
	public static void startSuite() {
		html = new ExtentSparkReporter(System.getProperty("user.dir")+resultsPath+"/Report.html");
		report = new ExtentReports();
		
	}
	
	public static void startFeature(String featureName) {
		feature = report.createTest(Feature.class, featureName);
	}
	
	public static void startTest(String scenarioName) {		
		scenario = feature.createNode(Scenario.class, scenarioName);
	}
	
	
	
	public static void endTest() {
		report.attachReporter(html);
		report.flush();
	}
	
	public static void log(StepType stepType, String stepName, Status status) {
		switch (stepType) {
		case Given:
			stepName = "<b>Given</b> "+stepName;
			break;
		case When:
			stepName = "<b>When</b> "+stepName;
			break;
		case Then:
			stepName = "<b>Then</b> "+stepName;
			break;
		case And:
			stepName = "<b>And</b> "+stepName;
			break;
		default:
			break;
		}
		switch (status) {
		case PASS:
		case INFO:
			scenario.createNode(stepName);
			break;
		case FAIL:
			scenario.createNode(stepName).fail("");
			break;
		default:
			break;
		}
		
	}
	
	
	
}
